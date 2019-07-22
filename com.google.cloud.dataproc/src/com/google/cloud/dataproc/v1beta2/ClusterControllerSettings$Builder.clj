(ns com.google.cloud.dataproc.v1beta2.ClusterControllerSettings$Builder
  "Builder for ClusterControllerSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 ClusterControllerSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dataproc.v1beta2.ClusterControllerSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerSettings$Builder [^ClusterControllerSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-cluster-operation-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerSettings$Builder this]
    (-> this (.createClusterOperationSettings))))

(defn delete-cluster-operation-settings
  "Returns the builder for the settings used for calls to deleteCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerSettings$Builder this]
    (-> this (.deleteClusterOperationSettings))))

(defn update-cluster-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerSettings$Builder this]
    (-> this (.updateClusterSettings))))

(defn diagnose-cluster-operation-settings
  "Returns the builder for the settings used for calls to diagnoseCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.DiagnoseClusterResults>`"
  ([^ClusterControllerSettings$Builder this]
    (-> this (.diagnoseClusterOperationSettings))))

(defn build
  "returns: `com.google.cloud.dataproc.v1beta2.ClusterControllerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerSettings [^ClusterControllerSettings$Builder this]
    (-> this (.build))))

(defn delete-cluster-settings
  "Returns the builder for the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerSettings$Builder this]
    (-> this (.deleteClusterSettings))))

(defn update-cluster-operation-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerSettings$Builder this]
    (-> this (.updateClusterOperationSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStubSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStubSettings$Builder [^ClusterControllerSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn diagnose-cluster-settings
  "Returns the builder for the settings used for calls to diagnoseCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerSettings$Builder this]
    (-> this (.diagnoseClusterSettings))))

(defn list-clusters-settings
  "Returns the builder for the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ListClustersResponse,com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ClusterControllerSettings$Builder this]
    (-> this (.listClustersSettings))))

(defn create-cluster-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerSettings$Builder this]
    (-> this (.createClusterSettings))))

(defn get-cluster-settings
  "Returns the builder for the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1beta2.GetClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerSettings$Builder this]
    (-> this (.getClusterSettings))))

