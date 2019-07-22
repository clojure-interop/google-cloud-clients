(ns com.google.cloud.compute.v1.FirewallSettings
  "Settings class to configure an instance of FirewallClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteFirewall to 30 seconds:



  FirewallSettings.Builder firewallSettingsBuilder =
      FirewallSettings.newBuilder();
  firewallSettingsBuilder.deleteFirewallSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  FirewallSettings firewallSettings = firewallSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FirewallSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (FirewallSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (FirewallSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (FirewallSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (FirewallSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.FirewallSettings$Builder`"
  (^com.google.cloud.compute.v1.FirewallSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (FirewallSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.FirewallSettings$Builder []
    (FirewallSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (FirewallSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (FirewallSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.FirewallStubSettings`

  returns: `com.google.cloud.compute.v1.FirewallSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.FirewallSettings [^com.google.cloud.compute.v1.stub.FirewallStubSettings stub]
    (FirewallSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (FirewallSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (FirewallSettings/getDefaultServiceScopes )))

(defn delete-firewall-settings
  "Returns the object with the settings used for calls to deleteFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirewallSettings this]
    (-> this (.deleteFirewallSettings))))

(defn get-firewall-settings
  "Returns the object with the settings used for calls to getFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetFirewallHttpRequest,com.google.cloud.compute.v1.Firewall>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirewallSettings this]
    (-> this (.getFirewallSettings))))

(defn insert-firewall-settings
  "Returns the object with the settings used for calls to insertFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirewallSettings this]
    (-> this (.insertFirewallSettings))))

(defn list-firewalls-settings
  "Returns the object with the settings used for calls to listFirewalls.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListFirewallsHttpRequest,com.google.cloud.compute.v1.FirewallList,com.google.cloud.compute.v1.FirewallClient$ListFirewallsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^FirewallSettings this]
    (-> this (.listFirewallsSettings))))

(defn patch-firewall-settings
  "Returns the object with the settings used for calls to patchFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirewallSettings this]
    (-> this (.patchFirewallSettings))))

(defn update-firewall-settings
  "Returns the object with the settings used for calls to updateFirewall.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateFirewallHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^FirewallSettings this]
    (-> this (.updateFirewallSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.FirewallSettings$Builder`"
  (^com.google.cloud.compute.v1.FirewallSettings$Builder [^FirewallSettings this]
    (-> this (.toBuilder))))

