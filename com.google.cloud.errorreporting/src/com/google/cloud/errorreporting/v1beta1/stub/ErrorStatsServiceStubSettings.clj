(ns com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings
  "Settings class to configure an instance of ErrorStatsServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (clouderrorreporting.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteEvents to 30 seconds:



  ErrorStatsServiceStubSettings.Builder errorStatsServiceSettingsBuilder =
      ErrorStatsServiceStubSettings.newBuilder();
  errorStatsServiceSettingsBuilder.deleteEventsSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ErrorStatsServiceStubSettings errorStatsServiceSettings = errorStatsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ErrorStatsServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ErrorStatsServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ErrorStatsServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ErrorStatsServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ErrorStatsServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ErrorStatsServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ErrorStatsServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ErrorStatsServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ErrorStatsServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder []
    (ErrorStatsServiceStubSettings/newBuilder )))

(defn list-group-stats-settings
  "Returns the object with the settings used for calls to listGroupStats.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ErrorStatsServiceStubSettings this]
    (-> this (.listGroupStatsSettings))))

(defn list-events-settings
  "Returns the object with the settings used for calls to listEvents.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ErrorStatsServiceStubSettings this]
    (-> this (.listEventsSettings))))

(defn delete-events-settings
  "Returns the object with the settings used for calls to deleteEvents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ErrorStatsServiceStubSettings this]
    (-> this (.deleteEventsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStub`

  throws: java.io.IOException"
  ([^ErrorStatsServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder [^ErrorStatsServiceStubSettings this]
    (-> this (.toBuilder))))

