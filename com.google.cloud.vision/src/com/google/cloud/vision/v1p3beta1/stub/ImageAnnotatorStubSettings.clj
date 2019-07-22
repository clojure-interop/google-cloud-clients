(ns com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings
  "Settings class to configure an instance of ImageAnnotatorStub.

  The default instance has everything set to sensible defaults:


    The default service address (vision.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of batchAnnotateImages to 30 seconds:



  ImageAnnotatorStubSettings.Builder imageAnnotatorSettingsBuilder =
      ImageAnnotatorStubSettings.newBuilder();
  imageAnnotatorSettingsBuilder.batchAnnotateImagesSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ImageAnnotatorStubSettings imageAnnotatorSettings = imageAnnotatorSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p3beta1.stub ImageAnnotatorStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ImageAnnotatorStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ImageAnnotatorStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ImageAnnotatorStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ImageAnnotatorStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ImageAnnotatorStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ImageAnnotatorStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ImageAnnotatorStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings$Builder`"
  (^com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ImageAnnotatorStubSettings/newBuilder client-context))
  (^com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings$Builder []
    (ImageAnnotatorStubSettings/newBuilder )))

(defn batch-annotate-images-settings
  "Returns the object with the settings used for calls to batchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageAnnotatorStubSettings this]
    (-> this (.batchAnnotateImagesSettings))))

(defn async-batch-annotate-files-settings
  "Returns the object with the settings used for calls to asyncBatchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageAnnotatorStubSettings this]
    (-> this (.asyncBatchAnnotateFilesSettings))))

(defn async-batch-annotate-files-operation-settings
  "Returns the object with the settings used for calls to asyncBatchAnnotateFiles.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.vision.v1p3beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p3beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p3beta1.OperationMetadata>`"
  ([^ImageAnnotatorStubSettings this]
    (-> this (.asyncBatchAnnotateFilesOperationSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStub`

  throws: java.io.IOException"
  ([^ImageAnnotatorStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings$Builder`"
  (^com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings$Builder [^ImageAnnotatorStubSettings this]
    (-> this (.toBuilder))))

