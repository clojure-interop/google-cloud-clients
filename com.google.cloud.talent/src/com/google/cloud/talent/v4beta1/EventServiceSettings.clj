(ns com.google.cloud.talent.v4beta1.EventServiceSettings
  "Settings class to configure an instance of EventServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createClientEvent to 30 seconds:



  EventServiceSettings.Builder eventServiceSettingsBuilder =
      EventServiceSettings.newBuilder();
  eventServiceSettingsBuilder.createClientEventSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  EventServiceSettings eventServiceSettings = eventServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 EventServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (EventServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EventServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (EventServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.EventServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.EventServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (EventServiceSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.EventServiceSettings$Builder []
    (EventServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (EventServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings`

  returns: `com.google.cloud.talent.v4beta1.EventServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.EventServiceSettings [^com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings stub]
    (EventServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (EventServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (EventServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (EventServiceSettings/getDefaultServiceScopes )))

(defn create-client-event-settings
  "Returns the object with the settings used for calls to createClientEvent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateClientEventRequest,com.google.cloud.talent.v4beta1.ClientEvent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EventServiceSettings this]
    (-> this (.createClientEventSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.EventServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.EventServiceSettings$Builder [^EventServiceSettings this]
    (-> this (.toBuilder))))

