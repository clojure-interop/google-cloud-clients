(ns com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings
  "Settings class to configure an instance of StreamingVideoIntelligenceServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (videointelligence.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of streamingAnnotateVideoCallable to 30 seconds:



  StreamingVideoIntelligenceServiceSettings.Builder streamingVideoIntelligenceServiceSettingsBuilder =
      StreamingVideoIntelligenceServiceSettings.newBuilder();
  streamingVideoIntelligenceServiceSettingsBuilder.streamingAnnotateVideoSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  StreamingVideoIntelligenceServiceSettings streamingVideoIntelligenceServiceSettings = streamingVideoIntelligenceServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p3beta1 StreamingVideoIntelligenceServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (StreamingVideoIntelligenceServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (StreamingVideoIntelligenceServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (StreamingVideoIntelligenceServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings$Builder`"
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (StreamingVideoIntelligenceServiceSettings/newBuilder client-context))
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings$Builder []
    (StreamingVideoIntelligenceServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (StreamingVideoIntelligenceServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings`

  returns: `com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings [^com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings stub]
    (StreamingVideoIntelligenceServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (StreamingVideoIntelligenceServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (StreamingVideoIntelligenceServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (StreamingVideoIntelligenceServiceSettings/getDefaultServiceScopes )))

(defn streaming-annotate-video-settings
  "Returns the object with the settings used for calls to streamingAnnotateVideo.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest,com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^StreamingVideoIntelligenceServiceSettings this]
    (-> this (.streamingAnnotateVideoSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings$Builder`"
  (^com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings$Builder [^StreamingVideoIntelligenceServiceSettings this]
    (-> this (.toBuilder))))

