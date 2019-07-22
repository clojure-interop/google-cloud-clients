(ns com.google.cloud.compute.v1.AutoscalerSettings$Builder
  "Builder for AutoscalerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalerSettings$Builder]))

(defn update-autoscaler-settings
  "Returns the builder for the settings used for calls to updateAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.updateAutoscalerSettings))))

(defn patch-autoscaler-settings
  "Returns the builder for the settings used for calls to patchAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.patchAutoscalerSettings))))

(defn get-autoscaler-settings
  "Returns the builder for the settings used for calls to getAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.getAutoscalerSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.AutoscalerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.AutoscalerSettings$Builder [^AutoscalerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn insert-autoscaler-settings
  "Returns the builder for the settings used for calls to insertAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.insertAutoscalerSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AutoscalerSettings [^AutoscalerSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder [^AutoscalerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn delete-autoscaler-settings
  "Returns the builder for the settings used for calls to deleteAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.deleteAutoscalerSettings))))

(defn aggregated-list-autoscalers-settings
  "Returns the builder for the settings used for calls to aggregatedListAutoscalers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerAggregatedList,com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.aggregatedListAutoscalersSettings))))

(defn list-autoscalers-settings
  "Returns the builder for the settings used for calls to listAutoscalers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerList,com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoscalerSettings$Builder this]
    (-> this (.listAutoscalersSettings))))

