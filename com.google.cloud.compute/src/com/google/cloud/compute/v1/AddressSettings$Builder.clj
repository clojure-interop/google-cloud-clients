(ns com.google.cloud.compute.v1.AddressSettings$Builder
  "Builder for AddressSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.AddressStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AddressStubSettings$Builder [^AddressSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.AddressSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.AddressSettings$Builder [^AddressSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-addresses-settings
  "Returns the builder for the settings used for calls to aggregatedListAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AddressSettings$Builder this]
    (-> this (.aggregatedListAddressesSettings))))

(defn delete-address-settings
  "Returns the builder for the settings used for calls to deleteAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AddressSettings$Builder this]
    (-> this (.deleteAddressSettings))))

(defn get-address-settings
  "Returns the builder for the settings used for calls to getAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AddressSettings$Builder this]
    (-> this (.getAddressSettings))))

(defn insert-address-settings
  "Returns the builder for the settings used for calls to insertAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AddressSettings$Builder this]
    (-> this (.insertAddressSettings))))

(defn list-addresses-settings
  "Returns the builder for the settings used for calls to listAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AddressSettings$Builder this]
    (-> this (.listAddressesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.AddressSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AddressSettings [^AddressSettings$Builder this]
    (-> this (.build))))

