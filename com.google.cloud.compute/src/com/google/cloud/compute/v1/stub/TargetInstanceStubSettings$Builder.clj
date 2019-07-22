(ns com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder
  "Builder for TargetInstanceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetInstanceStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder [^TargetInstanceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TargetInstanceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-target-instances-settings
  "Returns the builder for the settings used for calls to aggregatedListTargetInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList,com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetInstanceStubSettings$Builder this]
    (-> this (.aggregatedListTargetInstancesSettings))))

(defn delete-target-instance-settings
  "Returns the builder for the settings used for calls to deleteTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetInstanceStubSettings$Builder this]
    (-> this (.deleteTargetInstanceSettings))))

(defn get-target-instance-settings
  "Returns the builder for the settings used for calls to getTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetInstanceStubSettings$Builder this]
    (-> this (.getTargetInstanceSettings))))

(defn insert-target-instance-settings
  "Returns the builder for the settings used for calls to insertTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetInstanceStubSettings$Builder this]
    (-> this (.insertTargetInstanceSettings))))

(defn list-target-instances-settings
  "Returns the builder for the settings used for calls to listTargetInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList,com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetInstanceStubSettings$Builder this]
    (-> this (.listTargetInstancesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.TargetInstanceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings [^TargetInstanceStubSettings$Builder this]
    (-> this (.build))))

