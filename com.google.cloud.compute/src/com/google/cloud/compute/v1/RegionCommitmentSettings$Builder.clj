(ns com.google.cloud.compute.v1.RegionCommitmentSettings$Builder
  "Builder for RegionCommitmentSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionCommitmentSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder [^RegionCommitmentSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionCommitmentSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionCommitmentSettings$Builder [^RegionCommitmentSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-region-commitments-settings
  "Returns the builder for the settings used for calls to aggregatedListRegionCommitments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList,com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionCommitmentSettings$Builder this]
    (-> this (.aggregatedListRegionCommitmentsSettings))))

(defn get-region-commitment-settings
  "Returns the builder for the settings used for calls to getRegionCommitment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionCommitmentSettings$Builder this]
    (-> this (.getRegionCommitmentSettings))))

(defn insert-region-commitment-settings
  "Returns the builder for the settings used for calls to insertRegionCommitment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionCommitmentSettings$Builder this]
    (-> this (.insertRegionCommitmentSettings))))

(defn list-region-commitments-settings
  "Returns the builder for the settings used for calls to listRegionCommitments.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList,com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionCommitmentSettings$Builder this]
    (-> this (.listRegionCommitmentsSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionCommitmentSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionCommitmentSettings [^RegionCommitmentSettings$Builder this]
    (-> this (.build))))

