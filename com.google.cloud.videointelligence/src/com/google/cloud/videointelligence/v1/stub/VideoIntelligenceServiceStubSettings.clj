(ns com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings
  "Settings class to configure an instance of VideoIntelligenceServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (videointelligence.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of annotateVideoAsync to 30 seconds:



  VideoIntelligenceServiceStubSettings.Builder videoIntelligenceServiceSettingsBuilder =
      VideoIntelligenceServiceStubSettings.newBuilder();
  videoIntelligenceServiceSettingsBuilder.annotateVideoSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  VideoIntelligenceServiceStubSettings videoIntelligenceServiceSettings = videoIntelligenceServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1.stub VideoIntelligenceServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (VideoIntelligenceServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (VideoIntelligenceServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (VideoIntelligenceServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (VideoIntelligenceServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (VideoIntelligenceServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (VideoIntelligenceServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (VideoIntelligenceServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings$Builder`"
  (^com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (VideoIntelligenceServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings$Builder []
    (VideoIntelligenceServiceStubSettings/newBuilder )))

(defn annotate-video-settings
  "Returns the object with the settings used for calls to annotateVideo.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.videointelligence.v1.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^VideoIntelligenceServiceStubSettings this]
    (-> this (.annotateVideoSettings))))

(defn annotate-video-operation-settings
  "Returns the object with the settings used for calls to annotateVideo.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.videointelligence.v1.AnnotateVideoRequest,com.google.cloud.videointelligence.v1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1.AnnotateVideoProgress>`"
  ([^VideoIntelligenceServiceStubSettings this]
    (-> this (.annotateVideoOperationSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStub`

  throws: java.io.IOException"
  ([^VideoIntelligenceServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings$Builder`"
  (^com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings$Builder [^VideoIntelligenceServiceStubSettings this]
    (-> this (.toBuilder))))

