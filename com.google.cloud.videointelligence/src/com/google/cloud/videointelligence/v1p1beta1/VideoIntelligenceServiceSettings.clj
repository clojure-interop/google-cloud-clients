(ns com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings
  "Settings class to configure an instance of VideoIntelligenceServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (videointelligence.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of annotateVideoAsync to 30 seconds:



  VideoIntelligenceServiceSettings.Builder videoIntelligenceServiceSettingsBuilder =
      VideoIntelligenceServiceSettings.newBuilder();
  videoIntelligenceServiceSettingsBuilder.annotateVideoSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  VideoIntelligenceServiceSettings videoIntelligenceServiceSettings = videoIntelligenceServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p1beta1 VideoIntelligenceServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (VideoIntelligenceServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (VideoIntelligenceServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (VideoIntelligenceServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings$Builder`"
  (^com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (VideoIntelligenceServiceSettings/newBuilder client-context))
  (^com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings$Builder []
    (VideoIntelligenceServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (VideoIntelligenceServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.videointelligence.v1p1beta1.stub.VideoIntelligenceServiceStubSettings`

  returns: `com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings [^com.google.cloud.videointelligence.v1p1beta1.stub.VideoIntelligenceServiceStubSettings stub]
    (VideoIntelligenceServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (VideoIntelligenceServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (VideoIntelligenceServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (VideoIntelligenceServiceSettings/getDefaultServiceScopes )))

(defn annotate-video-settings
  "Returns the object with the settings used for calls to annotateVideo.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^VideoIntelligenceServiceSettings this]
    (-> this (.annotateVideoSettings))))

(defn annotate-video-operation-settings
  "Returns the object with the settings used for calls to annotateVideo.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoRequest,com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoProgress>`"
  ([^VideoIntelligenceServiceSettings this]
    (-> this (.annotateVideoOperationSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings$Builder`"
  (^com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings$Builder [^VideoIntelligenceServiceSettings this]
    (-> this (.toBuilder))))

