(ns com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceClient
  "Service Description: Service that implements Google Cloud Video Intelligence Streaming API.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient = StreamingVideoIntelligenceServiceClient.create()) {
    StreamingAnnotateVideoRequest request = StreamingAnnotateVideoRequest.newBuilder().build();
    ApiFuture<StreamingAnnotateVideoResponse> future = streamingVideoIntelligenceServiceClient.streamingAnnotateVideoCallable().futureCall(request);
    // Do something
    StreamingAnnotateVideoResponse response = future.get();
  }

  Note: close() needs to be called on the streamingVideoIntelligenceServiceClient object to
  clean up resources such as threads. In the example above, try-with-resources is used, which
  automatically calls close().

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

  This class can be customized by passing in a custom instance of
  StreamingVideoIntelligenceServiceSettings to create(). For example:

  To customize credentials:



  StreamingVideoIntelligenceServiceSettings streamingVideoIntelligenceServiceSettings =
      StreamingVideoIntelligenceServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
      StreamingVideoIntelligenceServiceClient.create(streamingVideoIntelligenceServiceSettings);

  To customize the endpoint:



  StreamingVideoIntelligenceServiceSettings streamingVideoIntelligenceServiceSettings =
      StreamingVideoIntelligenceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
      StreamingVideoIntelligenceServiceClient.create(streamingVideoIntelligenceServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p3beta1 StreamingVideoIntelligenceServiceClient]))

(defn *create
  "Constructs an instance of StreamingVideoIntelligenceServiceClient, using the given settings.
   The channels are created based on the settings passed in, or defaults for any settings that are
   not set.

  settings - `com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings`

  returns: `com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceClient [^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings settings]
    (StreamingVideoIntelligenceServiceClient/create settings))
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceClient []
    (StreamingVideoIntelligenceServiceClient/create )))

(defn get-settings
  "returns: `com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings`"
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings [^StreamingVideoIntelligenceServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStub`"
  ([^StreamingVideoIntelligenceServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^StreamingVideoIntelligenceServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^StreamingVideoIntelligenceServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^StreamingVideoIntelligenceServiceClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^StreamingVideoIntelligenceServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^StreamingVideoIntelligenceServiceClient this]
    (-> this (.isTerminated))))

(defn streaming-annotate-video-callable
  "Performs video annotation with bidirectional streaming: emitting results while sending
   video/audio bytes. This method is only available via the gRPC API (not REST).

   Sample code:



   try (StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient = StreamingVideoIntelligenceServiceClient.create()) {
     BidiStream<StreamingAnnotateVideoRequest, StreamingAnnotateVideoResponse> bidiStream =
         streamingVideoIntelligenceServiceClient.streamingAnnotateVideoCallable().call();

     StreamingAnnotateVideoRequest request = StreamingAnnotateVideoRequest.newBuilder().build();
     bidiStream.send(request);
     for (StreamingAnnotateVideoResponse response : bidiStream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest,com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^StreamingVideoIntelligenceServiceClient this]
    (-> this (.streamingAnnotateVideoCallable))))

(defn shutdown-now
  ""
  ([^StreamingVideoIntelligenceServiceClient this]
    (-> this (.shutdownNow))))

