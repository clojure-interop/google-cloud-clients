(ns com.google.cloud.automl.v1beta1.PredictionServiceSettings
  "Settings class to configure an instance of PredictionServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (automl.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of predict to 30 seconds:



  PredictionServiceSettings.Builder predictionServiceSettingsBuilder =
      PredictionServiceSettings.newBuilder();
  predictionServiceSettingsBuilder.predictSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  PredictionServiceSettings predictionServiceSettings = predictionServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 PredictionServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (PredictionServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (PredictionServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (PredictionServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (PredictionServiceSettings/newBuilder client-context))
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder []
    (PredictionServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (PredictionServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings`

  returns: `com.google.cloud.automl.v1beta1.PredictionServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings [^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings stub]
    (PredictionServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (PredictionServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (PredictionServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (PredictionServiceSettings/getDefaultServiceScopes )))

(defn predict-settings
  "Returns the object with the settings used for calls to predict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PredictionServiceSettings this]
    (-> this (.predictSettings))))

(defn batch-predict-settings
  "Returns the object with the settings used for calls to batchPredict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PredictionServiceSettings this]
    (-> this (.batchPredictSettings))))

(defn batch-predict-operation-settings
  "Returns the object with the settings used for calls to batchPredict.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^PredictionServiceSettings this]
    (-> this (.batchPredictOperationSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder [^PredictionServiceSettings this]
    (-> this (.toBuilder))))

