(ns com.google.cloud.vision.v1p1beta1.ImageAnnotatorClient
  "Service Description: Service that performs Google Cloud Vision API detection tasks over client
  images, such as face, landmark, logo, label, and text detection. The ImageAnnotator service
  returns detected entities from the images.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
    List<AnnotateImageRequest> requests = new ArrayList<>();
    BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
  }

  Note: close() needs to be called on the imageAnnotatorClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of ImageAnnotatorSettings to
  create(). For example:

  To customize credentials:



  ImageAnnotatorSettings imageAnnotatorSettings =
      ImageAnnotatorSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ImageAnnotatorClient imageAnnotatorClient =
      ImageAnnotatorClient.create(imageAnnotatorSettings);

  To customize the endpoint:



  ImageAnnotatorSettings imageAnnotatorSettings =
      ImageAnnotatorSettings.newBuilder().setEndpoint(myEndpoint).build();
  ImageAnnotatorClient imageAnnotatorClient =
      ImageAnnotatorClient.create(imageAnnotatorSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p1beta1 ImageAnnotatorClient]))

(defn *create
  "Constructs an instance of ImageAnnotatorClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings`

  returns: `com.google.cloud.vision.v1p1beta1.ImageAnnotatorClient`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p1beta1.ImageAnnotatorClient [^com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings settings]
    (ImageAnnotatorClient/create settings))
  (^com.google.cloud.vision.v1p1beta1.ImageAnnotatorClient []
    (ImageAnnotatorClient/create )))

(defn get-settings
  "returns: `com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings`"
  (^com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings [^ImageAnnotatorClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStub`"
  ([^ImageAnnotatorClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ImageAnnotatorClient this]
    (-> this (.isShutdown))))

(defn batch-annotate-images
  "Run image detection and annotation for a batch of images.

   Sample code:



   try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
     List<AnnotateImageRequest> requests = new ArrayList<>();
     BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
   }

  requests - Individual image annotation requests for this batch. - `java.util.List`

  returns: `com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse [^ImageAnnotatorClient this ^java.util.List requests]
    (-> this (.batchAnnotateImages requests))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ImageAnnotatorClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ImageAnnotatorClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^ImageAnnotatorClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ImageAnnotatorClient this]
    (-> this (.isTerminated))))

(defn batch-annotate-images-callable
  "Run image detection and annotation for a batch of images.

   Sample code:



   try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
     List<AnnotateImageRequest> requests = new ArrayList<>();
     BatchAnnotateImagesRequest request = BatchAnnotateImagesRequest.newBuilder()
       .addAllRequests(requests)
       .build();
     ApiFuture<BatchAnnotateImagesResponse> future = imageAnnotatorClient.batchAnnotateImagesCallable().futureCall(request);
     // Do something
     BatchAnnotateImagesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorClient this]
    (-> this (.batchAnnotateImagesCallable))))

(defn shutdown-now
  ""
  ([^ImageAnnotatorClient this]
    (-> this (.shutdownNow))))

