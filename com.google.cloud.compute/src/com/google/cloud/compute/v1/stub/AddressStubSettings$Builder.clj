(ns com.google.cloud.compute.v1.stub.AddressStubSettings$Builder
  "Builder for AddressStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AddressStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.AddressStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.AddressStubSettings$Builder [^AddressStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^AddressStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-addresses-settings
  "Returns the builder for the settings used for calls to aggregatedListAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AddressStubSettings$Builder this]
    (-> this (.aggregatedListAddressesSettings))))

(defn delete-address-settings
  "Returns the builder for the settings used for calls to deleteAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AddressStubSettings$Builder this]
    (-> this (.deleteAddressSettings))))

(defn get-address-settings
  "Returns the builder for the settings used for calls to getAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AddressStubSettings$Builder this]
    (-> this (.getAddressSettings))))

(defn insert-address-settings
  "Returns the builder for the settings used for calls to insertAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AddressStubSettings$Builder this]
    (-> this (.insertAddressSettings))))

(defn list-addresses-settings
  "Returns the builder for the settings used for calls to listAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AddressStubSettings$Builder this]
    (-> this (.listAddressesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.AddressStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.AddressStubSettings [^AddressStubSettings$Builder this]
    (-> this (.build))))

