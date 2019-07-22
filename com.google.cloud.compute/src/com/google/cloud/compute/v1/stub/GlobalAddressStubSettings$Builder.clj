(ns com.google.cloud.compute.v1.stub.GlobalAddressStubSettings$Builder
  "Builder for GlobalAddressStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalAddressStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.GlobalAddressStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.GlobalAddressStubSettings$Builder [^GlobalAddressStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^GlobalAddressStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-global-address-settings
  "Returns the builder for the settings used for calls to deleteGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalAddressStubSettings$Builder this]
    (-> this (.deleteGlobalAddressSettings))))

(defn get-global-address-settings
  "Returns the builder for the settings used for calls to getGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalAddressStubSettings$Builder this]
    (-> this (.getGlobalAddressSettings))))

(defn insert-global-address-settings
  "Returns the builder for the settings used for calls to insertGlobalAddress.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GlobalAddressStubSettings$Builder this]
    (-> this (.insertGlobalAddressSettings))))

(defn list-global-addresses-settings
  "Returns the builder for the settings used for calls to listGlobalAddresses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList,com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GlobalAddressStubSettings$Builder this]
    (-> this (.listGlobalAddressesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.GlobalAddressStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.GlobalAddressStubSettings [^GlobalAddressStubSettings$Builder this]
    (-> this (.build))))

