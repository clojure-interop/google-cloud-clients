(ns com.google.cloud.compute.v1.stub.ProjectStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ProjectStub]))

(defn ->project-stub
  "Constructor."
  (^ProjectStub []
    (new ProjectStub )))

(defn set-common-instance-metadata-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.setCommonInstanceMetadataProjectCallable))))

(defn move-instance-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.moveInstanceProjectCallable))))

(defn list-xpn-hosts-projects-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.listXpnHostsProjectsPagedCallable))))

(defn disable-xpn-host-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.disableXpnHostProjectCallable))))

(defn enable-xpn-resource-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.enableXpnResourceProjectCallable))))

(defn set-usage-export-bucket-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.setUsageExportBucketProjectCallable))))

(defn set-default-network-tier-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.setDefaultNetworkTierProjectCallable))))

(defn get-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.getProjectCallable))))

(defn enable-xpn-host-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.enableXpnHostProjectCallable))))

(defn get-xpn-host-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.getXpnHostProjectCallable))))

(defn close
  ""
  ([^ProjectStub this]
    (-> this (.close))))

(defn get-xpn-resources-projects-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.getXpnResourcesProjectsPagedCallable))))

(defn list-xpn-hosts-projects-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.XpnHostList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.listXpnHostsProjectsCallable))))

(defn get-xpn-resources-projects-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectsGetXpnResources>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.getXpnResourcesProjectsCallable))))

(defn move-disk-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.MoveDiskProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.moveDiskProjectCallable))))

(defn disable-xpn-resource-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectStub this]
    (-> this (.disableXpnResourceProjectCallable))))

