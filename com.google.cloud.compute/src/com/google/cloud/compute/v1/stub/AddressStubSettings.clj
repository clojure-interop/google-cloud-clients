(ns com.google.cloud.compute.v1.stub.AddressStubSettings
  "Settings class to configure an instance of AddressStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteAddress to 30 seconds:



  AddressStubSettings.Builder addressSettingsBuilder =
      AddressStubSettings.newBuilder();
  addressSettingsBuilder.deleteAddressSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AddressStubSettings addressSettings = addressSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AddressStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (AddressStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AddressStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AddressStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AddressStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.AddressStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AddressStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AddressStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.AddressStubSettings$Builder []
    (AddressStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AddressStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (AddressStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AddressStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AddressStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-addresses-settings
  "Returns the object with the settings used for calls to aggregatedListAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AddressStubSettings this]
    (-> this (.aggregatedListAddressesSettings))))

(defn delete-address-settings
  "Returns the object with the settings used for calls to deleteAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AddressStubSettings this]
    (-> this (.deleteAddressSettings))))

(defn get-address-settings
  "Returns the object with the settings used for calls to getAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AddressStubSettings this]
    (-> this (.getAddressSettings))))

(defn insert-address-settings
  "Returns the object with the settings used for calls to insertAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AddressStubSettings this]
    (-> this (.insertAddressSettings))))

(defn list-addresses-settings
  "Returns the object with the settings used for calls to listAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AddressStubSettings this]
    (-> this (.listAddressesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.AddressStub`

  throws: java.io.IOException"
  ([^AddressStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.AddressStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AddressStubSettings$Builder [^AddressStubSettings this]
    (-> this (.toBuilder))))

