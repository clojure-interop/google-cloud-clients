(ns com.google.cloud.vision.v1p2beta1.ImageAnnotatorClient
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
  (:import [com.google.cloud.vision.v1p2beta1 ImageAnnotatorClient]))

(defn *create
  "Constructs an instance of ImageAnnotatorClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings`

  returns: `com.google.cloud.vision.v1p2beta1.ImageAnnotatorClient`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p2beta1.ImageAnnotatorClient [^com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings settings]
    (ImageAnnotatorClient/create settings))
  (^com.google.cloud.vision.v1p2beta1.ImageAnnotatorClient []
    (ImageAnnotatorClient/create )))

(defn async-batch-annotate-files-async
  "Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   contain multiple pages and multiple images per page. Progress and results can be retrieved
   through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   (results).

   Sample code:



   try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
     List<AsyncAnnotateFileRequest> requests = new ArrayList<>();
     AsyncBatchAnnotateFilesResponse response = imageAnnotatorClient.asyncBatchAnnotateFilesAsync(requests).get();
   }

  requests - Individual async file annotation requests for this batch. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p2beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ImageAnnotatorClient this ^java.util.List requests]
    (-> this (.asyncBatchAnnotateFilesAsync requests))))

(defn async-batch-annotate-files-callable
  "Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   contain multiple pages and multiple images per page. Progress and results can be retrieved
   through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   (results).

   Sample code:



   try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
     List<AsyncAnnotateFileRequest> requests = new ArrayList<>();
     AsyncBatchAnnotateFilesRequest request = AsyncBatchAnnotateFilesRequest.newBuilder()
       .addAllRequests(requests)
       .build();
     ApiFuture<Operation> future = imageAnnotatorClient.asyncBatchAnnotateFilesCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorClient this]
    (-> this (.asyncBatchAnnotateFilesCallable))))

(defn get-settings
  "returns: `com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings`"
  (^com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings [^ImageAnnotatorClient this]
    (-> this (.getSettings))))

(defn async-batch-annotate-files-operation-callable
  "Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   contain multiple pages and multiple images per page. Progress and results can be retrieved
   through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   (results).

   Sample code:



   try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
     List<AsyncAnnotateFileRequest> requests = new ArrayList<>();
     AsyncBatchAnnotateFilesRequest request = AsyncBatchAnnotateFilesRequest.newBuilder()
       .addAllRequests(requests)
       .build();
     OperationFuture<AsyncBatchAnnotateFilesResponse, OperationMetadata> future = imageAnnotatorClient.asyncBatchAnnotateFilesOperationCallable().futureCall(request);
     // Do something
     AsyncBatchAnnotateFilesResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p2beta1.OperationMetadata>`"
  ([^ImageAnnotatorClient this]
    (-> this (.asyncBatchAnnotateFilesOperationCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStub`"
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

  returns: `com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesResponse [^ImageAnnotatorClient this ^java.util.List requests]
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

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^ImageAnnotatorClient this]
    (-> this (.getOperationsClient))))

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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ImageAnnotatorClient this]
    (-> this (.batchAnnotateImagesCallable))))

(defn shutdown-now
  ""
  ([^ImageAnnotatorClient this]
    (-> this (.shutdownNow))))

