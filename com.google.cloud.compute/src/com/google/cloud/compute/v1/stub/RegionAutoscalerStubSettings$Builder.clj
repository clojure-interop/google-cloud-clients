(ns com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings$Builder
  "Builder for RegionAutoscalerStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionAutoscalerStubSettings$Builder]))

(defn get-region-autoscaler-settings
  "Returns the builder for the settings used for calls to getRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.getRegionAutoscalerSettings))))

(defn update-region-autoscaler-settings
  "Returns the builder for the settings used for calls to updateRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.updateRegionAutoscalerSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings$Builder [^RegionAutoscalerStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn insert-region-autoscaler-settings
  "Returns the builder for the settings used for calls to insertRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.insertRegionAutoscalerSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.build))))

(defn delete-region-autoscaler-settings
  "Returns the builder for the settings used for calls to deleteRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.deleteRegionAutoscalerSettings))))

(defn patch-region-autoscaler-settings
  "Returns the builder for the settings used for calls to patchRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.patchRegionAutoscalerSettings))))

(defn list-region-autoscalers-settings
  "Returns the builder for the settings used for calls to listRegionAutoscalers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerList,com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.listRegionAutoscalersSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RegionAutoscalerStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

