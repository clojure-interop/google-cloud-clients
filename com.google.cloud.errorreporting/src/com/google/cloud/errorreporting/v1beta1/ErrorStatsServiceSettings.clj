(ns com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings
  "Settings class to configure an instance of ErrorStatsServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (clouderrorreporting.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteEvents to 30 seconds:



  ErrorStatsServiceSettings.Builder errorStatsServiceSettingsBuilder =
      ErrorStatsServiceSettings.newBuilder();
  errorStatsServiceSettingsBuilder.deleteEventsSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ErrorStatsServiceSettings errorStatsServiceSettings = errorStatsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorStatsServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ErrorStatsServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ErrorStatsServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ErrorStatsServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ErrorStatsServiceSettings/newBuilder client-context))
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings$Builder []
    (ErrorStatsServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ErrorStatsServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings [^com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings stub]
    (ErrorStatsServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ErrorStatsServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ErrorStatsServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ErrorStatsServiceSettings/getDefaultServiceScopes )))

(defn list-group-stats-settings
  "Returns the object with the settings used for calls to listGroupStats.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ErrorStatsServiceSettings this]
    (-> this (.listGroupStatsSettings))))

(defn list-events-settings
  "Returns the object with the settings used for calls to listEvents.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ErrorStatsServiceSettings this]
    (-> this (.listEventsSettings))))

(defn delete-events-settings
  "Returns the object with the settings used for calls to deleteEvents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ErrorStatsServiceSettings this]
    (-> this (.deleteEventsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings$Builder [^ErrorStatsServiceSettings this]
    (-> this (.toBuilder))))

