(ns com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings
  "Settings class to configure an instance of WebRiskServiceV1Beta1Stub.

  The default instance has everything set to sensible defaults:


    The default service address (webrisk.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of computeThreatListDiff to 30 seconds:



  WebRiskServiceV1Beta1StubSettings.Builder webRiskServiceV1Beta1SettingsBuilder =
      WebRiskServiceV1Beta1StubSettings.newBuilder();
  webRiskServiceV1Beta1SettingsBuilder.computeThreatListDiffSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  WebRiskServiceV1Beta1StubSettings webRiskServiceV1Beta1Settings = webRiskServiceV1Beta1SettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.webrisk.v1beta1.stub WebRiskServiceV1Beta1StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (WebRiskServiceV1Beta1StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (WebRiskServiceV1Beta1StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (WebRiskServiceV1Beta1StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (WebRiskServiceV1Beta1StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (WebRiskServiceV1Beta1StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (WebRiskServiceV1Beta1StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (WebRiskServiceV1Beta1StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (WebRiskServiceV1Beta1StubSettings/newBuilder client-context))
  (^com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder []
    (WebRiskServiceV1Beta1StubSettings/newBuilder )))

(defn compute-threat-list-diff-settings
  "Returns the object with the settings used for calls to computeThreatListDiff.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.webrisk.v1beta1.ComputeThreatListDiffRequest,com.google.webrisk.v1beta1.ComputeThreatListDiffResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebRiskServiceV1Beta1StubSettings this]
    (-> this (.computeThreatListDiffSettings))))

(defn search-uris-settings
  "Returns the object with the settings used for calls to searchUris.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.webrisk.v1beta1.SearchUrisRequest,com.google.webrisk.v1beta1.SearchUrisResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebRiskServiceV1Beta1StubSettings this]
    (-> this (.searchUrisSettings))))

(defn search-hashes-settings
  "Returns the object with the settings used for calls to searchHashes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.webrisk.v1beta1.SearchHashesRequest,com.google.webrisk.v1beta1.SearchHashesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WebRiskServiceV1Beta1StubSettings this]
    (-> this (.searchHashesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1Stub`

  throws: java.io.IOException"
  ([^WebRiskServiceV1Beta1StubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder [^WebRiskServiceV1Beta1StubSettings this]
    (-> this (.toBuilder))))

