# # JW Player SDK for Android and usage with flutter using message channels

## Getting Started

This project is a starting point for a Flutter application.

This application contains an example implementation of the JW Player SDK for Android and channeled to flutter.

#### Usage instructions:

- Clone the repository into your workspace, `git clone https://github.com/laurelGit/jwtplayerFlutterDemo.git`
- Open the `JWPlayerViewExample` Activity and replace `YOUR_LICENSE_KEY` with your license key
- Inside the `JWPlayerViewExample` Activity, under load a media source comment, this function: `playlistUrl("https://cdn.jwplayer.com/v2/media/1sc0kL2N?format=json")` of the class `PlayerConfig`, takes a json file as URL which contains the various media HLS or DASH file resolutions such as 480p, 720p etc with thier respectif audio files and metadata.

```dart
code
```

- To use a single HLS or DASH file, your can use the `file("dash or HLS URL here")` of the class `PlayerConfig` too and pass the URL of the media file.
- The message channel used is `"com.io.wilfried.play/jw"` and the method called is `"getPlayer"`

The demo application should now build and run. For more information on how to use the SDK refer to the developer guide:

[https://developer.jwplayer.com/jwplayer/docs/android-add-the-android-sdk](https://developer.jwplayer.com/jwplayer/docs/android-add-the-android-sdk)
