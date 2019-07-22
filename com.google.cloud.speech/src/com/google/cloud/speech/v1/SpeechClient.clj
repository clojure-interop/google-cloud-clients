(ns com.google.cloud.speech.v1.SpeechClient
  "Service Description: Service that implements Google Cloud Speech API.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SpeechClient speechClient = SpeechClient.create()) {
    RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
    int sampleRateHertz = 44100;
    String languageCode = \"en-US\";
    RecognitionConfig config = RecognitionConfig.newBuilder()
      .setEncoding(encoding)
      .setSampleRateHertz(sampleRateHertz)
      .setLanguageCode(languageCode)
      .build();
    String uri = \"gs://bucket_name/file_name.flac\";
    RecognitionAudio audio = RecognitionAudio.newBuilder()
      .setUri(uri)
      .build();
    RecognizeResponse response = speechClient.recognize(config, audio);
  }

  Note: close() needs to be called on the speechClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of SpeechSettings to create().
  For example:

  To customize credentials:



  SpeechSettings speechSettings =
      SpeechSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SpeechClient speechClient =
      SpeechClient.create(speechSettings);

  To customize the endpoint:



  SpeechSettings speechSettings =
      SpeechSettings.newBuilder().setEndpoint(myEndpoint).build();
  SpeechClient speechClient =
      SpeechClient.create(speechSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.speech.v1 SpeechClient]))

(defn *create
  "Constructs an instance of SpeechClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.speech.v1.SpeechSettings`

  returns: `com.google.cloud.speech.v1.SpeechClient`

  throws: java.io.IOException"
  (^com.google.cloud.speech.v1.SpeechClient [^com.google.cloud.speech.v1.SpeechSettings settings]
    (SpeechClient/create settings))
  (^com.google.cloud.speech.v1.SpeechClient []
    (SpeechClient/create )))

(defn long-running-recognize-async
  "Performs asynchronous speech recognition: receive results via the google.longrunning.Operations
   interface. Returns either an `Operation.error` or an `Operation.response` which contains a
   `LongRunningRecognizeResponse` message.

   Sample code:



   try (SpeechClient speechClient = SpeechClient.create()) {
     RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
     int sampleRateHertz = 44100;
     String languageCode = \"en-US\";
     RecognitionConfig config = RecognitionConfig.newBuilder()
       .setEncoding(encoding)
       .setSampleRateHertz(sampleRateHertz)
       .setLanguageCode(languageCode)
       .build();
     String uri = \"gs://bucket_name/file_name.flac\";
     RecognitionAudio audio = RecognitionAudio.newBuilder()
       .setUri(uri)
       .build();
     LongRunningRecognizeResponse response = speechClient.longRunningRecognizeAsync(config, audio).get();
   }

  config - *Required* Provides information to the recognizer that specifies how to process the request. - `com.google.cloud.speech.v1.RecognitionConfig`
  audio - *Required* The audio data to be recognized. - `com.google.cloud.speech.v1.RecognitionAudio`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.speech.v1.LongRunningRecognizeResponse,com.google.cloud.speech.v1.LongRunningRecognizeMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SpeechClient this ^com.google.cloud.speech.v1.RecognitionConfig config ^com.google.cloud.speech.v1.RecognitionAudio audio]
    (-> this (.longRunningRecognizeAsync config audio)))
  ([^SpeechClient this ^com.google.cloud.speech.v1.LongRunningRecognizeRequest request]
    (-> this (.longRunningRecognizeAsync request))))

(defn get-settings
  "returns: `com.google.cloud.speech.v1.SpeechSettings`"
  (^com.google.cloud.speech.v1.SpeechSettings [^SpeechClient this]
    (-> this (.getSettings))))

(defn long-running-recognize-operation-callable
  "Performs asynchronous speech recognition: receive results via the google.longrunning.Operations
   interface. Returns either an `Operation.error` or an `Operation.response` which contains a
   `LongRunningRecognizeResponse` message.

   Sample code:



   try (SpeechClient speechClient = SpeechClient.create()) {
     RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
     int sampleRateHertz = 44100;
     String languageCode = \"en-US\";
     RecognitionConfig config = RecognitionConfig.newBuilder()
       .setEncoding(encoding)
       .setSampleRateHertz(sampleRateHertz)
       .setLanguageCode(languageCode)
       .build();
     String uri = \"gs://bucket_name/file_name.flac\";
     RecognitionAudio audio = RecognitionAudio.newBuilder()
       .setUri(uri)
       .build();
     LongRunningRecognizeRequest request = LongRunningRecognizeRequest.newBuilder()
       .setConfig(config)
       .setAudio(audio)
       .build();
     OperationFuture<LongRunningRecognizeResponse, LongRunningRecognizeMetadata> future = speechClient.longRunningRecognizeOperationCallable().futureCall(request);
     // Do something
     LongRunningRecognizeResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.speech.v1.LongRunningRecognizeRequest,com.google.cloud.speech.v1.LongRunningRecognizeResponse,com.google.cloud.speech.v1.LongRunningRecognizeMetadata>`"
  ([^SpeechClient this]
    (-> this (.longRunningRecognizeOperationCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.speech.v1.stub.SpeechStub`"
  ([^SpeechClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SpeechClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SpeechClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SpeechClient this]
    (-> this (.shutdown))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^SpeechClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^SpeechClient this]
    (-> this (.close))))

(defn recognize
  "Performs synchronous speech recognition: receive results after all audio has been sent and
   processed.

   Sample code:



   try (SpeechClient speechClient = SpeechClient.create()) {
     RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
     int sampleRateHertz = 44100;
     String languageCode = \"en-US\";
     RecognitionConfig config = RecognitionConfig.newBuilder()
       .setEncoding(encoding)
       .setSampleRateHertz(sampleRateHertz)
       .setLanguageCode(languageCode)
       .build();
     String uri = \"gs://bucket_name/file_name.flac\";
     RecognitionAudio audio = RecognitionAudio.newBuilder()
       .setUri(uri)
       .build();
     RecognizeResponse response = speechClient.recognize(config, audio);
   }

  config - *Required* Provides information to the recognizer that specifies how to process the request. - `com.google.cloud.speech.v1.RecognitionConfig`
  audio - *Required* The audio data to be recognized. - `com.google.cloud.speech.v1.RecognitionAudio`

  returns: `com.google.cloud.speech.v1.RecognizeResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.speech.v1.RecognizeResponse [^SpeechClient this ^com.google.cloud.speech.v1.RecognitionConfig config ^com.google.cloud.speech.v1.RecognitionAudio audio]
    (-> this (.recognize config audio)))
  (^com.google.cloud.speech.v1.RecognizeResponse [^SpeechClient this ^com.google.cloud.speech.v1.RecognizeRequest request]
    (-> this (.recognize request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SpeechClient this]
    (-> this (.isTerminated))))

(defn streaming-recognize-callable
  "Performs bidirectional streaming speech recognition: receive results while sending audio. This
   method is only available via the gRPC API (not REST).

   Sample code:



   try (SpeechClient speechClient = SpeechClient.create()) {
     BidiStream<StreamingRecognizeRequest, StreamingRecognizeResponse> bidiStream =
         speechClient.streamingRecognizeCallable().call();

     StreamingRecognizeRequest request = StreamingRecognizeRequest.newBuilder().build();
     bidiStream.send(request);
     for (StreamingRecognizeResponse response : bidiStream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.speech.v1.StreamingRecognizeRequest,com.google.cloud.speech.v1.StreamingRecognizeResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^SpeechClient this]
    (-> this (.streamingRecognizeCallable))))

(defn long-running-recognize-callable
  "Performs asynchronous speech recognition: receive results via the google.longrunning.Operations
   interface. Returns either an `Operation.error` or an `Operation.response` which contains a
   `LongRunningRecognizeResponse` message.

   Sample code:



   try (SpeechClient speechClient = SpeechClient.create()) {
     RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
     int sampleRateHertz = 44100;
     String languageCode = \"en-US\";
     RecognitionConfig config = RecognitionConfig.newBuilder()
       .setEncoding(encoding)
       .setSampleRateHertz(sampleRateHertz)
       .setLanguageCode(languageCode)
       .build();
     String uri = \"gs://bucket_name/file_name.flac\";
     RecognitionAudio audio = RecognitionAudio.newBuilder()
       .setUri(uri)
       .build();
     LongRunningRecognizeRequest request = LongRunningRecognizeRequest.newBuilder()
       .setConfig(config)
       .setAudio(audio)
       .build();
     ApiFuture<Operation> future = speechClient.longRunningRecognizeCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.speech.v1.LongRunningRecognizeRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpeechClient this]
    (-> this (.longRunningRecognizeCallable))))

(defn shutdown-now
  ""
  ([^SpeechClient this]
    (-> this (.shutdownNow))))

(defn recognize-callable
  "Performs synchronous speech recognition: receive results after all audio has been sent and
   processed.

   Sample code:



   try (SpeechClient speechClient = SpeechClient.create()) {
     RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
     int sampleRateHertz = 44100;
     String languageCode = \"en-US\";
     RecognitionConfig config = RecognitionConfig.newBuilder()
       .setEncoding(encoding)
       .setSampleRateHertz(sampleRateHertz)
       .setLanguageCode(languageCode)
       .build();
     String uri = \"gs://bucket_name/file_name.flac\";
     RecognitionAudio audio = RecognitionAudio.newBuilder()
       .setUri(uri)
       .build();
     RecognizeRequest request = RecognizeRequest.newBuilder()
       .setConfig(config)
       .setAudio(audio)
       .build();
     ApiFuture<RecognizeResponse> future = speechClient.recognizeCallable().futureCall(request);
     // Do something
     RecognizeResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.speech.v1.RecognizeRequest,com.google.cloud.speech.v1.RecognizeResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpeechClient this]
    (-> this (.recognizeCallable))))

