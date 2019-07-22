(ns com.google.cloud.compute.v1.GlobalAddressSettings$Builder
  "Builder for GlobalAddressSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalAddressSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.GlobalAddressStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.GlobalAddressStubSettings$Builder [^GlobalAddressSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.GlobalAddressSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.GlobalAddressSettings$Builder [^GlobalAddressSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-global-address-settings
  "Returns the builder for the settings used for calls to deleteGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalAddressSettings$Builder this]
    (-> this (.deleteGlobalAddressSettings))))

(defn get-global-address-settings
  "Returns the builder for the settings used for calls to getGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalAddressSettings$Builder this]
    (-> this (.getGlobalAddressSettings))))

(defn insert-global-address-settings
  "Returns the builder for the settings used for calls to insertGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalAddressSettings$Builder this]
    (-> this (.insertGlobalAddressSettings))))

(defn list-global-addresses-settings
  "Returns the builder for the settings used for calls to listGlobalAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GlobalAddressSettings$Builder this]
    (-> this (.listGlobalAddressesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.GlobalAddressSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalAddressSettings [^GlobalAddressSettings$Builder this]
    (-> this (.build))))

