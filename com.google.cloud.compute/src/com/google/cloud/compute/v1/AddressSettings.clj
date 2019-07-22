(ns com.google.cloud.compute.v1.AddressSettings
  "Settings class to configure an instance of AddressClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteAddress to 30 seconds:



  AddressSettings.Builder addressSettingsBuilder =
      AddressSettings.newBuilder();
  addressSettingsBuilder.deleteAddressSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AddressSettings addressSettings = addressSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (AddressSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AddressSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AddressSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AddressSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.AddressSettings$Builder`"
  (^com.google.cloud.compute.v1.AddressSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AddressSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.AddressSettings$Builder []
    (AddressSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AddressSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (AddressSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.AddressStubSettings`

  returns: `com.google.cloud.compute.v1.AddressSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AddressSettings [^com.google.cloud.compute.v1.stub.AddressStubSettings stub]
    (AddressSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AddressSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AddressSettings/getDefaultServiceScopes )))

(defn aggregated-list-addresses-settings
  "Returns the object with the settings used for calls to aggregatedListAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AddressSettings this]
    (-> this (.aggregatedListAddressesSettings))))

(defn delete-address-settings
  "Returns the object with the settings used for calls to deleteAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AddressSettings this]
    (-> this (.deleteAddressSettings))))

(defn get-address-settings
  "Returns the object with the settings used for calls to getAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AddressSettings this]
    (-> this (.getAddressSettings))))

(defn insert-address-settings
  "Returns the object with the settings used for calls to insertAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AddressSettings this]
    (-> this (.insertAddressSettings))))

(defn list-addresses-settings
  "Returns the object with the settings used for calls to listAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AddressSettings this]
    (-> this (.listAddressesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.AddressSettings$Builder`"
  (^com.google.cloud.compute.v1.AddressSettings$Builder [^AddressSettings this]
    (-> this (.toBuilder))))

