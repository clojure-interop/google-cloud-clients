(ns com.google.cloud.automl.v1beta1.PredictionServiceClient
  "Service Description: AutoML Prediction API.

  On any input that is documented to expect a string parameter in snake_case or kebab-case,
  either of those cases is accepted.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
    ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
    ExamplePayload payload = ExamplePayload.newBuilder().build();
    Map<String, String> params = new HashMap<>();
    PredictResponse response = predictionServiceClient.predict(name, payload, params);
  }

  Note: close() needs to be called on the predictionServiceClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of PredictionServiceSettings to
  create(). For example:

  To customize credentials:



  PredictionServiceSettings predictionServiceSettings =
      PredictionServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  PredictionServiceClient predictionServiceClient =
      PredictionServiceClient.create(predictionServiceSettings);

  To customize the endpoint:



  PredictionServiceSettings predictionServiceSettings =
      PredictionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  PredictionServiceClient predictionServiceClient =
      PredictionServiceClient.create(predictionServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 PredictionServiceClient]))

(defn *create
  "Constructs an instance of PredictionServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.automl.v1beta1.PredictionServiceSettings`

  returns: `com.google.cloud.automl.v1beta1.PredictionServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.PredictionServiceClient [^com.google.cloud.automl.v1beta1.PredictionServiceSettings settings]
    (PredictionServiceClient/create settings))
  (^com.google.cloud.automl.v1beta1.PredictionServiceClient []
    (PredictionServiceClient/create )))

(defn batch-predict-async
  "Perform a batch prediction. Unlike the online
   [Predict][google.cloud.automl.v1beta1.PredictionService.Predict], batch prediction result won't
   be immediately available in the response. Instead, a long running operation object is returned.
   User can poll the operation result via
   [GetOperation][google.longrunning.Operations.GetOperation] method. Once the operation is done,
   [BatchPredictResult][google.cloud.automl.v1beta1.BatchPredictResult] is returned in the
   [response][google.longrunning.Operation.response] field. Available for following ML problems:
   * Video Classification * Video Object Tracking * Text Extraction * Tables

   Sample code:



   try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
     BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
     Map<String, String> params = new HashMap<>();
     BatchPredictResult response = predictionServiceClient.batchPredictAsync(name, inputConfig, outputConfig, params).get();
   }

  name - Name of the model requested to serve the batch prediction. - `com.google.cloud.automl.v1beta1.ModelName`
  input-config - Required. The input configuration for batch prediction. - `com.google.cloud.automl.v1beta1.BatchPredictInputConfig`
  output-config - Required. The Configuration specifying where output predictions should be written. - `com.google.cloud.automl.v1beta1.BatchPredictOutputConfig`
  params - Additional domain-specific parameters for the predictions, any string must be up to 25000 characters long. * For Video Classification : `score_threshold` - (float) A value from 0.0 to 1.0. When the model makes predictions for a video, it will only produce results that have at least this confidence score. The default is 0.5. `segment_classification` - (boolean) Set to true to request segment-level classification. AutoML Video Intelligence returns labels and their confidence scores for the entire segment of the video that user specified in the request configuration. The default is \"true\". `shot_classification` - (boolean) Set to true to request shot-level classification. AutoML Video Intelligence determines the boundaries for each camera shot in the entire segment of the video that user specified in the request configuration. AutoML Video Intelligence then returns labels and their confidence scores for each detected shot, along with the start and end time of the shot. WARNING: Model evaluation is not done for this classification type, the quality of it depends on training data, but there are no metrics provided to describe that quality. The default is \"false\". `1s_interval_classification` - (boolean) Set to true to request classification for a video at one-second intervals. AutoML Video Intelligence returns labels and their confidence scores for each second of the entire segment of the video that user specified in the request configuration. WARNING: Model evaluation is not done for this classification type, the quality of it depends on training data, but there are no metrics provided to describe that quality. The default is \"false\". * For Video Object Tracking: `score_threshold` - (float) When Model detects objects on video frames, it will only produce bounding boxes which have at least this confidence score. Value in 0 to 1 range, default is 0.5. `max_bounding_box_count` - (int64) No more than this number of bounding boxes will be returned per frame. Default is 100, the requested value may be limited by server. `min_bounding_box_size` - (float) Only bounding boxes with shortest edge at least that long as a relative value of video frame size will be returned. Value in 0 to 1 range. Default is 0. - `java.util.Map`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^PredictionServiceClient this ^com.google.cloud.automl.v1beta1.ModelName name ^com.google.cloud.automl.v1beta1.BatchPredictInputConfig input-config ^com.google.cloud.automl.v1beta1.BatchPredictOutputConfig output-config ^java.util.Map params]
    (-> this (.batchPredictAsync name input-config output-config params)))
  ([^PredictionServiceClient this ^com.google.cloud.automl.v1beta1.BatchPredictRequest request]
    (-> this (.batchPredictAsync request))))

(defn predict
  "Perform an online prediction. The prediction result will be directly returned in the response.
   Available for following ML problems, and their expected request payloads: * Image
   Classification - Image in .JPEG, .GIF or .PNG format, image_bytes up to 30MB. * Image
   Object Detection - Image in .JPEG, .GIF or .PNG format, image_bytes up to 30MB. * Text
   Classification - TextSnippet, content up to 60,000 characters, UTF-8 encoded. * Text
   Extraction - TextSnippet, content up to 30,000 characters, UTF-8 NFC encoded. * Translation
   - TextSnippet, content up to 25,000 characters, UTF-8 encoded. * Tables - Row, with column
   values matching the columns of the model, up to 5MB. Not available for FORECASTING

   [prediction_type][google.cloud.automl.v1beta1.TablesModelMetadata.prediction_type].

   Sample code:



   try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ExamplePayload payload = ExamplePayload.newBuilder().build();
     Map<String, String> params = new HashMap<>();
     PredictResponse response = predictionServiceClient.predict(name, payload, params);
   }

  name - Name of the model requested to serve the prediction. - `com.google.cloud.automl.v1beta1.ModelName`
  payload - Required. Payload to perform a prediction on. The payload must match the problem type that the model was trained to solve. - `com.google.cloud.automl.v1beta1.ExamplePayload`
  params - Additional domain-specific parameters, any string must be up to 25000 characters long. * For Image Classification: `score_threshold` - (float) A value from 0.0 to 1.0. When the model makes predictions for an image, it will only produce results that have at least this confidence score. The default is 0.5. * For Tables: `feature_importance` - (boolean) Whether [feature_importance][[google.cloud.automl.v1beta1.TablesModelColumnInfo.feature_importance] should be populated in the returned [TablesAnnotation(-s)][[google.cloud.automl.v1beta1.TablesAnnotation]. The default is false. - `java.util.Map`

  returns: `com.google.cloud.automl.v1beta1.PredictResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.automl.v1beta1.PredictResponse [^PredictionServiceClient this ^com.google.cloud.automl.v1beta1.ModelName name ^com.google.cloud.automl.v1beta1.ExamplePayload payload ^java.util.Map params]
    (-> this (.predict name payload params)))
  (^com.google.cloud.automl.v1beta1.PredictResponse [^PredictionServiceClient this ^com.google.cloud.automl.v1beta1.PredictRequest request]
    (-> this (.predict request))))

(defn get-settings
  "returns: `com.google.cloud.automl.v1beta1.PredictionServiceSettings`"
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings [^PredictionServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.automl.v1beta1.stub.PredictionServiceStub`"
  ([^PredictionServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^PredictionServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^PredictionServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^PredictionServiceClient this]
    (-> this (.shutdown))))

(defn batch-predict-callable
  "Perform a batch prediction. Unlike the online
   [Predict][google.cloud.automl.v1beta1.PredictionService.Predict], batch prediction result won't
   be immediately available in the response. Instead, a long running operation object is returned.
   User can poll the operation result via
   [GetOperation][google.longrunning.Operations.GetOperation] method. Once the operation is done,
   [BatchPredictResult][google.cloud.automl.v1beta1.BatchPredictResult] is returned in the
   [response][google.longrunning.Operation.response] field. Available for following ML problems:
   * Video Classification * Video Object Tracking * Text Extraction * Tables

   Sample code:



   try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
     BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
     BatchPredictRequest request = BatchPredictRequest.newBuilder()
       .setName(name.toString())
       .setInputConfig(inputConfig)
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = predictionServiceClient.batchPredictCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PredictionServiceClient this]
    (-> this (.batchPredictCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^PredictionServiceClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^PredictionServiceClient this]
    (-> this (.close))))

(defn predict-callable
  "Perform an online prediction. The prediction result will be directly returned in the response.
   Available for following ML problems, and their expected request payloads: * Image
   Classification - Image in .JPEG, .GIF or .PNG format, image_bytes up to 30MB. * Image
   Object Detection - Image in .JPEG, .GIF or .PNG format, image_bytes up to 30MB. * Text
   Classification - TextSnippet, content up to 60,000 characters, UTF-8 encoded. * Text
   Extraction - TextSnippet, content up to 30,000 characters, UTF-8 NFC encoded. * Translation
   - TextSnippet, content up to 25,000 characters, UTF-8 encoded. * Tables - Row, with column
   values matching the columns of the model, up to 5MB. Not available for FORECASTING

   [prediction_type][google.cloud.automl.v1beta1.TablesModelMetadata.prediction_type].

   Sample code:



   try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     ExamplePayload payload = ExamplePayload.newBuilder().build();
     PredictRequest request = PredictRequest.newBuilder()
       .setName(name.toString())
       .setPayload(payload)
       .build();
     ApiFuture<PredictResponse> future = predictionServiceClient.predictCallable().futureCall(request);
     // Do something
     PredictResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PredictionServiceClient this]
    (-> this (.predictCallable))))

(defn batch-predict-operation-callable
  "Perform a batch prediction. Unlike the online
   [Predict][google.cloud.automl.v1beta1.PredictionService.Predict], batch prediction result won't
   be immediately available in the response. Instead, a long running operation object is returned.
   User can poll the operation result via
   [GetOperation][google.longrunning.Operations.GetOperation] method. Once the operation is done,
   [BatchPredictResult][google.cloud.automl.v1beta1.BatchPredictResult] is returned in the
   [response][google.longrunning.Operation.response] field. Available for following ML problems:
   * Video Classification * Video Object Tracking * Text Extraction * Tables

   Sample code:



   try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
     ModelName name = ModelName.of(\"[PROJECT]\", \"[LOCATION]\", \"[MODEL]\");
     BatchPredictInputConfig inputConfig = BatchPredictInputConfig.newBuilder().build();
     BatchPredictOutputConfig outputConfig = BatchPredictOutputConfig.newBuilder().build();
     BatchPredictRequest request = BatchPredictRequest.newBuilder()
       .setName(name.toString())
       .setInputConfig(inputConfig)
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<BatchPredictResult, OperationMetadata> future = predictionServiceClient.batchPredictOperationCallable().futureCall(request);
     // Do something
     BatchPredictResult response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^PredictionServiceClient this]
    (-> this (.batchPredictOperationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^PredictionServiceClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^PredictionServiceClient this]
    (-> this (.shutdownNow))))

