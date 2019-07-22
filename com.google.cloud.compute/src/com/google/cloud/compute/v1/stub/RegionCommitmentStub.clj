(ns com.google.cloud.compute.v1.stub.RegionCommitmentStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionCommitmentStub]))

(defn ->region-commitment-stub
  "Constructor."
  (^RegionCommitmentStub []
    (new RegionCommitmentStub )))

(defn aggregated-list-region-commitments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentStub this]
    (-> this (.aggregatedListRegionCommitmentsPagedCallable))))

(defn aggregated-list-region-commitments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentStub this]
    (-> this (.aggregatedListRegionCommitmentsCallable))))

(defn get-region-commitment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentStub this]
    (-> this (.getRegionCommitmentCallable))))

(defn insert-region-commitment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentStub this]
    (-> this (.insertRegionCommitmentCallable))))

(defn list-region-commitments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentStub this]
    (-> this (.listRegionCommitmentsPagedCallable))))

(defn list-region-commitments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentStub this]
    (-> this (.listRegionCommitmentsCallable))))

(defn close
  ""
  ([^RegionCommitmentStub this]
    (-> this (.close))))

