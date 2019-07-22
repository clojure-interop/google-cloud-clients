(ns com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings
  "Settings class to configure an instance of PredictionServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (automl.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of predict to 30 seconds:



  PredictionServiceStubSettings.Builder predictionServiceSettingsBuilder =
      PredictionServiceStubSettings.newBuilder();
  predictionServiceSettingsBuilder.predictSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  PredictionServiceStubSettings predictionServiceSettings = predictionServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub PredictionServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (PredictionServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (PredictionServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (PredictionServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (PredictionServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (PredictionServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (PredictionServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (PredictionServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (PredictionServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder []
    (PredictionServiceStubSettings/newBuilder )))

(defn predict-settings
  "Returns the object with the settings used for calls to predict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PredictionServiceStubSettings this]
    (-> this (.predictSettings))))

(defn batch-predict-settings
  "Returns the object with the settings used for calls to batchPredict.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PredictionServiceStubSettings this]
    (-> this (.batchPredictSettings))))

(defn batch-predict-operation-settings
  "Returns the object with the settings used for calls to batchPredict.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^PredictionServiceStubSettings this]
    (-> this (.batchPredictOperationSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.automl.v1beta1.stub.PredictionServiceStub`

  throws: java.io.IOException"
  ([^PredictionServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder [^PredictionServiceStubSettings this]
    (-> this (.toBuilder))))

