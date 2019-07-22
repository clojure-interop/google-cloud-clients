(ns com.google.cloud.vision.v1.ImageAnnotatorSettings
  "Settings class to configure an instance of ImageAnnotatorClient.

  The default instance has everything set to sensible defaults:


    The default service address (vision.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of batchAnnotateImages to 30 seconds:



  ImageAnnotatorSettings.Builder imageAnnotatorSettingsBuilder =
      ImageAnnotatorSettings.newBuilder();
  imageAnnotatorSettingsBuilder.batchAnnotateImagesSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ImageAnnotatorSettings imageAnnotatorSettings = imageAnnotatorSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1 ImageAnnotatorSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ImageAnnotatorSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ImageAnnotatorSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ImageAnnotatorSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.vision.v1.ImageAnnotatorSettings$Builder`"
  (^com.google.cloud.vision.v1.ImageAnnotatorSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ImageAnnotatorSettings/newBuilder client-context))
  (^com.google.cloud.vision.v1.ImageAnnotatorSettings$Builder []
    (ImageAnnotatorSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ImageAnnotatorSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.vision.v1.stub.ImageAnnotatorStubSettings`

  returns: `com.google.cloud.vision.v1.ImageAnnotatorSettings`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1.ImageAnnotatorSettings [^com.google.cloud.vision.v1.stub.ImageAnnotatorStubSettings stub]
    (ImageAnnotatorSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ImageAnnotatorSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ImageAnnotatorSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ImageAnnotatorSettings/getDefaultServiceScopes )))

(defn batch-annotate-images-settings
  "Returns the object with the settings used for calls to batchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageAnnotatorSettings this]
    (-> this (.batchAnnotateImagesSettings))))

(defn batch-annotate-files-settings
  "Returns the object with the settings used for calls to batchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1.BatchAnnotateFilesRequest,com.google.cloud.vision.v1.BatchAnnotateFilesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageAnnotatorSettings this]
    (-> this (.batchAnnotateFilesSettings))))

(defn async-batch-annotate-images-settings
  "Returns the object with the settings used for calls to asyncBatchAnnotateImages.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1.AsyncBatchAnnotateImagesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageAnnotatorSettings this]
    (-> this (.asyncBatchAnnotateImagesSettings))))

(defn async-batch-annotate-images-operation-settings
  "Returns the object with the settings used for calls to asyncBatchAnnotateImages.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.vision.v1.AsyncBatchAnnotateImagesRequest,com.google.cloud.vision.v1.AsyncBatchAnnotateImagesResponse,com.google.cloud.vision.v1.OperationMetadata>`"
  ([^ImageAnnotatorSettings this]
    (-> this (.asyncBatchAnnotateImagesOperationSettings))))

(defn async-batch-annotate-files-settings
  "Returns the object with the settings used for calls to asyncBatchAnnotateFiles.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageAnnotatorSettings this]
    (-> this (.asyncBatchAnnotateFilesSettings))))

(defn async-batch-annotate-files-operation-settings
  "Returns the object with the settings used for calls to asyncBatchAnnotateFiles.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1.OperationMetadata>`"
  ([^ImageAnnotatorSettings this]
    (-> this (.asyncBatchAnnotateFilesOperationSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.vision.v1.ImageAnnotatorSettings$Builder`"
  (^com.google.cloud.vision.v1.ImageAnnotatorSettings$Builder [^ImageAnnotatorSettings this]
    (-> this (.toBuilder))))

