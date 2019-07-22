(ns com.google.cloud.texttospeech.v1.TextToSpeechClient
  "Service Description: Service that implements Google Cloud Text-to-Speech API.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
    String languageCode = \"\";
    ListVoicesResponse response = textToSpeechClient.listVoices(languageCode);
  }

  Note: close() needs to be called on the textToSpeechClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of TextToSpeechSettings to
  create(). For example:

  To customize credentials:



  TextToSpeechSettings textToSpeechSettings =
      TextToSpeechSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TextToSpeechClient textToSpeechClient =
      TextToSpeechClient.create(textToSpeechSettings);

  To customize the endpoint:



  TextToSpeechSettings textToSpeechSettings =
      TextToSpeechSettings.newBuilder().setEndpoint(myEndpoint).build();
  TextToSpeechClient textToSpeechClient =
      TextToSpeechClient.create(textToSpeechSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.texttospeech.v1 TextToSpeechClient]))

(defn *create
  "Constructs an instance of TextToSpeechClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.texttospeech.v1.TextToSpeechSettings`

  returns: `com.google.cloud.texttospeech.v1.TextToSpeechClient`

  throws: java.io.IOException"
  (^com.google.cloud.texttospeech.v1.TextToSpeechClient [^com.google.cloud.texttospeech.v1.TextToSpeechSettings settings]
    (TextToSpeechClient/create settings))
  (^com.google.cloud.texttospeech.v1.TextToSpeechClient []
    (TextToSpeechClient/create )))

(defn synthesize-speech-callable
  "Synthesizes speech synchronously: receive results after all text input has been processed.

   Sample code:



   try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
     SynthesisInput input = SynthesisInput.newBuilder().build();
     VoiceSelectionParams voice = VoiceSelectionParams.newBuilder().build();
     AudioConfig audioConfig = AudioConfig.newBuilder().build();
     SynthesizeSpeechRequest request = SynthesizeSpeechRequest.newBuilder()
       .setInput(input)
       .setVoice(voice)
       .setAudioConfig(audioConfig)
       .build();
     ApiFuture<SynthesizeSpeechResponse> future = textToSpeechClient.synthesizeSpeechCallable().futureCall(request);
     // Do something
     SynthesizeSpeechResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest,com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TextToSpeechClient this]
    (-> this (.synthesizeSpeechCallable))))

(defn get-settings
  "returns: `com.google.cloud.texttospeech.v1.TextToSpeechSettings`"
  (^com.google.cloud.texttospeech.v1.TextToSpeechSettings [^TextToSpeechClient this]
    (-> this (.getSettings))))

(defn list-voices-callable
  "Returns a list of Voice supported for synthesis.

   Sample code:



   try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
     ListVoicesRequest request = ListVoicesRequest.newBuilder().build();
     ApiFuture<ListVoicesResponse> future = textToSpeechClient.listVoicesCallable().futureCall(request);
     // Do something
     ListVoicesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.texttospeech.v1.ListVoicesRequest,com.google.cloud.texttospeech.v1.ListVoicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TextToSpeechClient this]
    (-> this (.listVoicesCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.texttospeech.v1.stub.TextToSpeechStub`"
  ([^TextToSpeechClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TextToSpeechClient this]
    (-> this (.isShutdown))))

(defn list-voices
  "Returns a list of Voice supported for synthesis.

   Sample code:



   try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
     String languageCode = \"\";
     ListVoicesResponse response = textToSpeechClient.listVoices(languageCode);
   }

  language-code - Optional (but recommended) [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. E.g. when specifying \"en-NZ\", you will get supported \"en-*\" voices; when specifying \"no\", you will get supported \"no-*\" (Norwegian) and \"nb-*\" (Norwegian Bokmal) voices; specifying \"zh\" will also get supported \"cmn-*\" voices; specifying \"zh-hk\" will also get supported \"yue-*\" voices. - `java.lang.String`

  returns: `com.google.cloud.texttospeech.v1.ListVoicesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.texttospeech.v1.ListVoicesResponse [^TextToSpeechClient this ^java.lang.String language-code]
    (-> this (.listVoices language-code))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TextToSpeechClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^TextToSpeechClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^TextToSpeechClient this]
    (-> this (.close))))

(defn synthesize-speech
  "Synthesizes speech synchronously: receive results after all text input has been processed.

   Sample code:



   try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
     SynthesisInput input = SynthesisInput.newBuilder().build();
     VoiceSelectionParams voice = VoiceSelectionParams.newBuilder().build();
     AudioConfig audioConfig = AudioConfig.newBuilder().build();
     SynthesizeSpeechResponse response = textToSpeechClient.synthesizeSpeech(input, voice, audioConfig);
   }

  input - Required. The Synthesizer requires either plain text or SSML as input. - `com.google.cloud.texttospeech.v1.SynthesisInput`
  voice - Required. The desired voice of the synthesized audio. - `com.google.cloud.texttospeech.v1.VoiceSelectionParams`
  audio-config - Required. The configuration of the synthesized audio. - `com.google.cloud.texttospeech.v1.AudioConfig`

  returns: `com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse [^TextToSpeechClient this ^com.google.cloud.texttospeech.v1.SynthesisInput input ^com.google.cloud.texttospeech.v1.VoiceSelectionParams voice ^com.google.cloud.texttospeech.v1.AudioConfig audio-config]
    (-> this (.synthesizeSpeech input voice audio-config)))
  (^com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse [^TextToSpeechClient this ^com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest request]
    (-> this (.synthesizeSpeech request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TextToSpeechClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^TextToSpeechClient this]
    (-> this (.shutdownNow))))

