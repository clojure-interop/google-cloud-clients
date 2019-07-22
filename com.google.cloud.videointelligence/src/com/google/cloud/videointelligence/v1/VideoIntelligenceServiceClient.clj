(ns com.google.cloud.videointelligence.v1.VideoIntelligenceServiceClient
  "Service Description: Service that implements Google Cloud Video Intelligence API.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (VideoIntelligenceServiceClient videoIntelligenceServiceClient = VideoIntelligenceServiceClient.create()) {
    String inputUri = \"gs://cloud-samples-data/video/cat.mp4\";
    Feature featuresElement = Feature.LABEL_DETECTION;
    List<Feature> features = Arrays.asList(featuresElement);
    AnnotateVideoResponse response = videoIntelligenceServiceClient.annotateVideoAsync(inputUri, features).get();
  }

  Note: close() needs to be called on the videoIntelligenceServiceClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

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
  VideoIntelligenceServiceSettings to create(). For example:

  To customize credentials:



  VideoIntelligenceServiceSettings videoIntelligenceServiceSettings =
      VideoIntelligenceServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  VideoIntelligenceServiceClient videoIntelligenceServiceClient =
      VideoIntelligenceServiceClient.create(videoIntelligenceServiceSettings);

  To customize the endpoint:



  VideoIntelligenceServiceSettings videoIntelligenceServiceSettings =
      VideoIntelligenceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  VideoIntelligenceServiceClient videoIntelligenceServiceClient =
      VideoIntelligenceServiceClient.create(videoIntelligenceServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1 VideoIntelligenceServiceClient]))

(defn *create
  "Constructs an instance of VideoIntelligenceServiceClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings`

  returns: `com.google.cloud.videointelligence.v1.VideoIntelligenceServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1.VideoIntelligenceServiceClient [^com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings settings]
    (VideoIntelligenceServiceClient/create settings))
  (^com.google.cloud.videointelligence.v1.VideoIntelligenceServiceClient []
    (VideoIntelligenceServiceClient/create )))

(defn annotate-video-async
  "Performs asynchronous video annotation. Progress and results can be retrieved through the
   `google.longrunning.Operations` interface. `Operation.metadata` contains
   `AnnotateVideoProgress` (progress). `Operation.response` contains `AnnotateVideoResponse`
   (results).

   Sample code:



   try (VideoIntelligenceServiceClient videoIntelligenceServiceClient = VideoIntelligenceServiceClient.create()) {
     String inputUri = \"gs://cloud-samples-data/video/cat.mp4\";
     Feature featuresElement = Feature.LABEL_DETECTION;
     List<Feature> features = Arrays.asList(featuresElement);
     AnnotateVideoResponse response = videoIntelligenceServiceClient.annotateVideoAsync(inputUri, features).get();
   }

  input-uri - Input video location. Currently, only [Google Cloud Storage](https://cloud.google.com/storage/) URIs are supported, which must be specified in the following format: `gs://bucket-id/object-id` (other URI formats return [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more information, see [Request URIs](/storage/docs/reference-uris). A video URI may include wildcards in `object-id`, and thus identify multiple videos. Supported wildcards: '*' to match 0 or more characters; '?' to match 1 character. If unset, the input video should be embedded in the request as `input_content`. If set, `input_content` should be unset. - `java.lang.String`
  features - Requested video annotation features. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.videointelligence.v1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1.AnnotateVideoProgress>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^VideoIntelligenceServiceClient this ^java.lang.String input-uri ^java.util.List features]
    (-> this (.annotateVideoAsync input-uri features)))
  ([^VideoIntelligenceServiceClient this ^com.google.cloud.videointelligence.v1.AnnotateVideoRequest request]
    (-> this (.annotateVideoAsync request))))

(defn get-settings
  "returns: `com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings`"
  (^com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings [^VideoIntelligenceServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStub`"
  ([^VideoIntelligenceServiceClient this]
    (-> this (.getStub))))

(defn annotate-video-callable
  "Performs asynchronous video annotation. Progress and results can be retrieved through the
   `google.longrunning.Operations` interface. `Operation.metadata` contains
   `AnnotateVideoProgress` (progress). `Operation.response` contains `AnnotateVideoResponse`
   (results).

   Sample code:



   try (VideoIntelligenceServiceClient videoIntelligenceServiceClient = VideoIntelligenceServiceClient.create()) {
     String inputUri = \"gs://cloud-samples-data/video/cat.mp4\";
     Feature featuresElement = Feature.LABEL_DETECTION;
     List<Feature> features = Arrays.asList(featuresElement);
     AnnotateVideoRequest request = AnnotateVideoRequest.newBuilder()
       .setInputUri(inputUri)
       .addAllFeatures(features)
       .build();
     ApiFuture<Operation> future = videoIntelligenceServiceClient.annotateVideoCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.videointelligence.v1.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VideoIntelligenceServiceClient this]
    (-> this (.annotateVideoCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^VideoIntelligenceServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^VideoIntelligenceServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^VideoIntelligenceServiceClient this]
    (-> this (.shutdown))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^VideoIntelligenceServiceClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^VideoIntelligenceServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^VideoIntelligenceServiceClient this]
    (-> this (.isTerminated))))

(defn annotate-video-operation-callable
  "Performs asynchronous video annotation. Progress and results can be retrieved through the
   `google.longrunning.Operations` interface. `Operation.metadata` contains
   `AnnotateVideoProgress` (progress). `Operation.response` contains `AnnotateVideoResponse`
   (results).

   Sample code:



   try (VideoIntelligenceServiceClient videoIntelligenceServiceClient = VideoIntelligenceServiceClient.create()) {
     String inputUri = \"gs://cloud-samples-data/video/cat.mp4\";
     Feature featuresElement = Feature.LABEL_DETECTION;
     List<Feature> features = Arrays.asList(featuresElement);
     AnnotateVideoRequest request = AnnotateVideoRequest.newBuilder()
       .setInputUri(inputUri)
       .addAllFeatures(features)
       .build();
     OperationFuture<AnnotateVideoResponse, AnnotateVideoProgress> future = videoIntelligenceServiceClient.annotateVideoOperationCallable().futureCall(request);
     // Do something
     AnnotateVideoResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.videointelligence.v1.AnnotateVideoRequest,com.google.cloud.videointelligence.v1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1.AnnotateVideoProgress>`"
  ([^VideoIntelligenceServiceClient this]
    (-> this (.annotateVideoOperationCallable))))

(defn shutdown-now
  ""
  ([^VideoIntelligenceServiceClient this]
    (-> this (.shutdownNow))))

