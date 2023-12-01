package com.petros.efthymiou.dailypulse.sources.data

class SourcesRepository(
    private val dataSource: SourcesDataSource,
    private val service: SourcesService
) {

    suspend fun getAllSources(): List<SourceRaw> {
        val sourcesDb = dataSource.getAllSources()
        if (sourcesDb.isEmpty()) {
            dataSource.clearSources()
            val fetchedSources = service.fetchSources()
            dataSource.createSources(fetchedSources)
            return fetchedSources
        }
        return sourcesDb
    }
}