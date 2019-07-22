(ns com.google.cloud.dataproc.v1beta2.stub.GrpcClusterControllerStub
  "gRPC stub implementation for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub GrpcClusterControllerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dataproc.v1beta2.stub.GrpcClusterControllerStub`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.stub.GrpcClusterControllerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcClusterControllerStub/create client-context callable-factory))
  (^com.google.cloud.dataproc.v1beta2.stub.GrpcClusterControllerStub [^com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStubSettings settings]
    (GrpcClusterControllerStub/create settings)))

(defn list-clusters-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.listClustersCallable))))

(defn create-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.createClusterCallable))))

(defn get-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.getClusterCallable))))

(defn diagnose-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.DiagnoseClusterResults>`"
  ([^GrpcClusterControllerStub this]
    (-> this (.diagnoseClusterOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcClusterControllerStub this]
    (-> this (.getOperationsStub))))

(defn diagnose-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.diagnoseClusterCallable))))

(defn update-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.updateClusterCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcClusterControllerStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcClusterControllerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcClusterControllerStub this]
    (-> this (.shutdown))))

(defn delete-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.deleteClusterCallable))))

(defn close
  ""
  ([^GrpcClusterControllerStub this]
    (-> this (.close))))

(defn list-clusters-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcClusterControllerStub this]
    (-> this (.listClustersPagedCallable))))

(defn update-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^GrpcClusterControllerStub this]
    (-> this (.updateClusterOperationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcClusterControllerStub this]
    (-> this (.isTerminated))))

(defn delete-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^GrpcClusterControllerStub this]
    (-> this (.deleteClusterOperationCallable))))

(defn shutdown-now
  ""
  ([^GrpcClusterControllerStub this]
    (-> this (.shutdownNow))))

(defn create-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^GrpcClusterControllerStub this]
    (-> this (.createClusterOperationCallable))))

