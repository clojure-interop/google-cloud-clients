(ns com.google.cloud.compute.v1.TargetPoolSettings$Builder
  "Builder for TargetPoolSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolSettings$Builder]))

(defn set-backup-target-pool-settings
  "Returns the builder for the settings used for calls to setBackupTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.setBackupTargetPoolSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.TargetPoolSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.TargetPoolSettings$Builder [^TargetPoolSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-target-pools-settings
  "Returns the builder for the settings used for calls to listTargetPools.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList,com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.listTargetPoolsSettings))))

(defn add-health-check-target-pool-settings
  "Returns the builder for the settings used for calls to addHealthCheckTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.addHealthCheckTargetPoolSettings))))

(defn insert-target-pool-settings
  "Returns the builder for the settings used for calls to insertTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.insertTargetPoolSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetPoolSettings [^TargetPoolSettings$Builder this]
    (-> this (.build))))

(defn remove-health-check-target-pool-settings
  "Returns the builder for the settings used for calls to removeHealthCheckTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.removeHealthCheckTargetPoolSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder [^TargetPoolSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn delete-target-pool-settings
  "Returns the builder for the settings used for calls to deleteTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.deleteTargetPoolSettings))))

(defn get-target-pool-settings
  "Returns the builder for the settings used for calls to getTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.getTargetPoolSettings))))

(defn add-instance-target-pool-settings
  "Returns the builder for the settings used for calls to addInstanceTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.addInstanceTargetPoolSettings))))

(defn remove-instance-target-pool-settings
  "Returns the builder for the settings used for calls to removeInstanceTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.removeInstanceTargetPoolSettings))))

(defn aggregated-list-target-pools-settings
  "Returns the builder for the settings used for calls to aggregatedListTargetPools.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList,com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.aggregatedListTargetPoolsSettings))))

(defn get-health-target-pool-settings
  "Returns the builder for the settings used for calls to getHealthTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetPoolSettings$Builder this]
    (-> this (.getHealthTargetPoolSettings))))

