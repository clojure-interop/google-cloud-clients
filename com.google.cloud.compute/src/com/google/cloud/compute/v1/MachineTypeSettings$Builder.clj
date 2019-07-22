(ns com.google.cloud.compute.v1.MachineTypeSettings$Builder
  "Builder for MachineTypeSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineTypeSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.MachineTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.MachineTypeStubSettings$Builder [^MachineTypeSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.MachineTypeSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.MachineTypeSettings$Builder [^MachineTypeSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-machine-types-settings
  "Returns the builder for the settings used for calls to aggregatedListMachineTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeAggregatedList,com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MachineTypeSettings$Builder this]
    (-> this (.aggregatedListMachineTypesSettings))))

(defn get-machine-type-settings
  "Returns the builder for the settings used for calls to getMachineType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetMachineTypeHttpRequest,com.google.cloud.compute.v1.MachineType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^MachineTypeSettings$Builder this]
    (-> this (.getMachineTypeSettings))))

(defn list-machine-types-settings
  "Returns the builder for the settings used for calls to listMachineTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeList,com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^MachineTypeSettings$Builder this]
    (-> this (.listMachineTypesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.MachineTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.MachineTypeSettings [^MachineTypeSettings$Builder this]
    (-> this (.build))))

