(ns com.google.cloud.asset.v1beta1.AssetServiceClient
  "Service Description: Asset service definition.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
    ProjectName parent = ProjectName.of(\"[PROJECT]\");
    ContentType contentType = ContentType.CONTENT_TYPE_UNSPECIFIED;
    TimeWindow readTimeWindow = TimeWindow.newBuilder().build();
    BatchGetAssetsHistoryRequest request = BatchGetAssetsHistoryRequest.newBuilder()
      .setParent(parent.toString())
      .setContentType(contentType)
      .setReadTimeWindow(readTimeWindow)
      .build();
    BatchGetAssetsHistoryResponse response = assetServiceClient.batchGetAssetsHistory(request);
  }

  Note: close() needs to be called on the assetServiceClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of AssetServiceSettings to
  create(). For example:

  To customize credentials:



  AssetServiceSettings assetServiceSettings =
      AssetServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AssetServiceClient assetServiceClient =
      AssetServiceClient.create(assetServiceSettings);

  To customize the endpoint:



  AssetServiceSettings assetServiceSettings =
      AssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  AssetServiceClient assetServiceClient =
      AssetServiceClient.create(assetServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1beta1 AssetServiceClient]))

(defn *create
  "Constructs an instance of AssetServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.asset.v1beta1.AssetServiceSettings`

  returns: `com.google.cloud.asset.v1beta1.AssetServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.asset.v1beta1.AssetServiceClient [^com.google.cloud.asset.v1beta1.AssetServiceSettings settings]
    (AssetServiceClient/create settings))
  (^com.google.cloud.asset.v1beta1.AssetServiceClient []
    (AssetServiceClient/create )))

(defn export-assets-async
  "Exports assets with time and resource types to a given Cloud Storage location. The output
   format is newline-delimited JSON. This API implements the
   [google.longrunning.Operation][google.longrunning.Operation] API allowing you to keep track of
   the export.

   Sample code:



   try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportAssetsRequest request = ExportAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .setOutputConfig(outputConfig)
       .build();
     ExportAssetsResponse response = assetServiceClient.exportAssetsAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.asset.v1beta1.ExportAssetsRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.asset.v1beta1.ExportAssetsResponse,com.google.cloud.asset.v1beta1.ExportAssetsRequest>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AssetServiceClient this ^com.google.cloud.asset.v1beta1.ExportAssetsRequest request]
    (-> this (.exportAssetsAsync request))))

(defn batch-get-assets-history-callable
  "Batch gets the update history of assets that overlap a time window. For RESOURCE content, this
   API outputs history with asset in both non-delete or deleted status. For IAM_POLICY content,
   this API outputs history when the asset and its attached IAM POLICY both exist. This can create
   gaps in the output history.

   Sample code:



   try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ContentType contentType = ContentType.CONTENT_TYPE_UNSPECIFIED;
     TimeWindow readTimeWindow = TimeWindow.newBuilder().build();
     BatchGetAssetsHistoryRequest request = BatchGetAssetsHistoryRequest.newBuilder()
       .setParent(parent.toString())
       .setContentType(contentType)
       .setReadTimeWindow(readTimeWindow)
       .build();
     ApiFuture<BatchGetAssetsHistoryResponse> future = assetServiceClient.batchGetAssetsHistoryCallable().futureCall(request);
     // Do something
     BatchGetAssetsHistoryResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AssetServiceClient this]
    (-> this (.batchGetAssetsHistoryCallable))))

(defn get-settings
  "returns: `com.google.cloud.asset.v1beta1.AssetServiceSettings`"
  (^com.google.cloud.asset.v1beta1.AssetServiceSettings [^AssetServiceClient this]
    (-> this (.getSettings))))

(defn export-assets-operation-callable
  "Exports assets with time and resource types to a given Cloud Storage location. The output
   format is newline-delimited JSON. This API implements the
   [google.longrunning.Operation][google.longrunning.Operation] API allowing you to keep track of
   the export.

   Sample code:



   try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportAssetsRequest request = ExportAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<ExportAssetsResponse, ExportAssetsRequest> future = assetServiceClient.exportAssetsOperationCallable().futureCall(request);
     // Do something
     ExportAssetsResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.cloud.asset.v1beta1.ExportAssetsResponse,com.google.cloud.asset.v1beta1.ExportAssetsRequest>`"
  ([^AssetServiceClient this]
    (-> this (.exportAssetsOperationCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.asset.v1beta1.stub.AssetServiceStub`"
  ([^AssetServiceClient this]
    (-> this (.getStub))))

(defn batch-get-assets-history
  "Batch gets the update history of assets that overlap a time window. For RESOURCE content, this
   API outputs history with asset in both non-delete or deleted status. For IAM_POLICY content,
   this API outputs history when the asset and its attached IAM POLICY both exist. This can create
   gaps in the output history.

   Sample code:



   try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ContentType contentType = ContentType.CONTENT_TYPE_UNSPECIFIED;
     TimeWindow readTimeWindow = TimeWindow.newBuilder().build();
     BatchGetAssetsHistoryRequest request = BatchGetAssetsHistoryRequest.newBuilder()
       .setParent(parent.toString())
       .setContentType(contentType)
       .setReadTimeWindow(readTimeWindow)
       .build();
     BatchGetAssetsHistoryResponse response = assetServiceClient.batchGetAssetsHistory(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest`

  returns: `com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse [^AssetServiceClient this ^com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest request]
    (-> this (.batchGetAssetsHistory request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AssetServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AssetServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^AssetServiceClient this]
    (-> this (.shutdown))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^AssetServiceClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^AssetServiceClient this]
    (-> this (.close))))

(defn export-assets-callable
  "Exports assets with time and resource types to a given Cloud Storage location. The output
   format is newline-delimited JSON. This API implements the
   [google.longrunning.Operation][google.longrunning.Operation] API allowing you to keep track of
   the export.

   Sample code:



   try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportAssetsRequest request = ExportAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = assetServiceClient.exportAssetsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AssetServiceClient this]
    (-> this (.exportAssetsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AssetServiceClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^AssetServiceClient this]
    (-> this (.shutdownNow))))

