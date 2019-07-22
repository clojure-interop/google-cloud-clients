(ns com.google.cloud.compute.v1.GlobalAddressSettings
  "Settings class to configure an instance of GlobalAddressClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteGlobalAddress to 30 seconds:



  GlobalAddressSettings.Builder globalAddressSettingsBuilder =
      GlobalAddressSettings.newBuilder();
  globalAddressSettingsBuilder.deleteGlobalAddressSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GlobalAddressSettings globalAddressSettings = globalAddressSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalAddressSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (GlobalAddressSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GlobalAddressSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GlobalAddressSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GlobalAddressSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.GlobalAddressSettings$Builder`"
  (^com.google.cloud.compute.v1.GlobalAddressSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GlobalAddressSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.GlobalAddressSettings$Builder []
    (GlobalAddressSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GlobalAddressSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (GlobalAddressSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.GlobalAddressStubSettings`

  returns: `com.google.cloud.compute.v1.GlobalAddressSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalAddressSettings [^com.google.cloud.compute.v1.stub.GlobalAddressStubSettings stub]
    (GlobalAddressSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GlobalAddressSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GlobalAddressSettings/getDefaultServiceScopes )))

(defn delete-global-address-settings
  "Returns the object with the settings used for calls to deleteGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalAddressSettings this]
    (-> this (.deleteGlobalAddressSettings))))

(defn get-global-address-settings
  "Returns the object with the settings used for calls to getGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalAddressSettings this]
    (-> this (.getGlobalAddressSettings))))

(defn insert-global-address-settings
  "Returns the object with the settings used for calls to insertGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalAddressSettings this]
    (-> this (.insertGlobalAddressSettings))))

(defn list-global-addresses-settings
  "Returns the object with the settings used for calls to listGlobalAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GlobalAddressSettings this]
    (-> this (.listGlobalAddressesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.GlobalAddressSettings$Builder`"
  (^com.google.cloud.compute.v1.GlobalAddressSettings$Builder [^GlobalAddressSettings this]
    (-> this (.toBuilder))))

