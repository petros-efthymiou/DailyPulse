import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        KoinInitializerKt.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
