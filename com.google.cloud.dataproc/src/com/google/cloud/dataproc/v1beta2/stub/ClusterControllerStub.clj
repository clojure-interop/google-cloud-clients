(ns com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStub
  "Base stub class for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub ClusterControllerStub]))

(defn ->cluster-controller-stub
  "Constructor."
  (^ClusterControllerStub []
    (new ClusterControllerStub )))

(defn list-clusters-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.listClustersCallable))))

(defn create-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.createClusterCallable))))

(defn get-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.getClusterCallable))))

(defn diagnose-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.DiagnoseClusterResults>`"
  ([^ClusterControllerStub this]
    (-> this (.diagnoseClusterOperationCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^ClusterControllerStub this]
    (-> this (.getOperationsStub))))

(defn diagnose-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.diagnoseClusterCallable))))

(defn update-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.updateClusterCallable))))

(defn delete-cluster-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.deleteClusterCallable))))

(defn close
  ""
  ([^ClusterControllerStub this]
    (-> this (.close))))

(defn list-clusters-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerStub this]
    (-> this (.listClustersPagedCallable))))

(defn update-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerStub this]
    (-> this (.updateClusterOperationCallable))))

(defn delete-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerStub this]
    (-> this (.deleteClusterOperationCallable))))

(defn create-cluster-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerStub this]
    (-> this (.createClusterOperationCallable))))

