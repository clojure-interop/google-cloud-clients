(ns com.google.cloud.compute.v1.TargetInstanceSettings$Builder
  "Builder for TargetInstanceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstanceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder [^TargetInstanceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.TargetInstanceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.TargetInstanceSettings$Builder [^TargetInstanceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-target-instances-settings
  "Returns the builder for the settings used for calls to aggregatedListTargetInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList,com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetInstanceSettings$Builder this]
    (-> this (.aggregatedListTargetInstancesSettings))))

(defn delete-target-instance-settings
  "Returns the builder for the settings used for calls to deleteTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetInstanceSettings$Builder this]
    (-> this (.deleteTargetInstanceSettings))))

(defn get-target-instance-settings
  "Returns the builder for the settings used for calls to getTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetInstanceSettings$Builder this]
    (-> this (.getTargetInstanceSettings))))

(defn insert-target-instance-settings
  "Returns the builder for the settings used for calls to insertTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetInstanceSettings$Builder this]
    (-> this (.insertTargetInstanceSettings))))

(defn list-target-instances-settings
  "Returns the builder for the settings used for calls to listTargetInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList,com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetInstanceSettings$Builder this]
    (-> this (.listTargetInstancesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetInstanceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetInstanceSettings [^TargetInstanceSettings$Builder this]
    (-> this (.build))))

