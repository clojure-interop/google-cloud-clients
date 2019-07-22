(ns com.google.cloud.compute.v1.stub.HttpJsonRegionCommitmentStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionCommitmentStub]))

(def *-aggregated-list-region-commitments-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList>"
  HttpJsonRegionCommitmentStub/aggregatedListRegionCommitmentsMethodDescriptor)

(def *-get-region-commitment-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>"
  HttpJsonRegionCommitmentStub/getRegionCommitmentMethodDescriptor)

(def *-insert-region-commitment-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionCommitmentStub/insertRegionCommitmentMethodDescriptor)

(def *-list-region-commitments-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList>"
  HttpJsonRegionCommitmentStub/listRegionCommitmentsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionCommitmentStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionCommitmentStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionCommitmentStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionCommitmentStub [^com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings settings]
    (HttpJsonRegionCommitmentStub/create settings)))

(defn aggregated-list-region-commitments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionCommitmentStub this]
    (-> this (.aggregatedListRegionCommitmentsCallable))))

(defn list-region-commitments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionCommitmentStub this]
    (-> this (.listRegionCommitmentsPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionCommitmentStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionCommitmentStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionCommitmentStub this]
    (-> this (.shutdown))))

(defn aggregated-list-region-commitments-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionCommitmentStub this]
    (-> this (.aggregatedListRegionCommitmentsPagedCallable))))

(defn close
  ""
  ([^HttpJsonRegionCommitmentStub this]
    (-> this (.close))))

(defn list-region-commitments-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionCommitmentStub this]
    (-> this (.listRegionCommitmentsCallable))))

(defn insert-region-commitment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionCommitmentStub this]
    (-> this (.insertRegionCommitmentCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionCommitmentStub this]
    (-> this (.isTerminated))))

(defn get-region-commitment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionCommitmentStub this]
    (-> this (.getRegionCommitmentCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionCommitmentStub this]
    (-> this (.shutdownNow))))

