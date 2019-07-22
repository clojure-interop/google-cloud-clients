(ns com.google.cloud.compute.v1.stub.HttpJsonProjectStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonProjectStub]))

(def *-disable-xpn-host-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/disableXpnHostProjectMethodDescriptor)

(def *-disable-xpn-resource-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/disableXpnResourceProjectMethodDescriptor)

(def *-enable-xpn-host-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/enableXpnHostProjectMethodDescriptor)

(def *-enable-xpn-resource-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/enableXpnResourceProjectMethodDescriptor)

(def *-get-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetProjectHttpRequest,com.google.cloud.compute.v1.Project>"
  HttpJsonProjectStub/getProjectMethodDescriptor)

(def *-get-xpn-host-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Project>"
  HttpJsonProjectStub/getXpnHostProjectMethodDescriptor)

(def *-get-xpn-resources-projects-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectsGetXpnResources>"
  HttpJsonProjectStub/getXpnResourcesProjectsMethodDescriptor)

(def *-list-xpn-hosts-projects-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.XpnHostList>"
  HttpJsonProjectStub/listXpnHostsProjectsMethodDescriptor)

(def *-move-disk-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.MoveDiskProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/moveDiskProjectMethodDescriptor)

(def *-move-instance-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/moveInstanceProjectMethodDescriptor)

(def *-set-common-instance-metadata-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/setCommonInstanceMetadataProjectMethodDescriptor)

(def *-set-default-network-tier-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/setDefaultNetworkTierProjectMethodDescriptor)

(def *-set-usage-export-bucket-project-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonProjectStub/setUsageExportBucketProjectMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonProjectStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonProjectStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonProjectStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonProjectStub [^com.google.cloud.compute.v1.stub.ProjectStubSettings settings]
    (HttpJsonProjectStub/create settings)))

(defn set-common-instance-metadata-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.setCommonInstanceMetadataProjectCallable))))

(defn move-instance-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.moveInstanceProjectCallable))))

(defn list-xpn-hosts-projects-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.listXpnHostsProjectsPagedCallable))))

(defn disable-xpn-host-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.disableXpnHostProjectCallable))))

(defn enable-xpn-resource-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.enableXpnResourceProjectCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonProjectStub this]
    (-> this (.isShutdown))))

(defn set-usage-export-bucket-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.setUsageExportBucketProjectCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonProjectStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-default-network-tier-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.setDefaultNetworkTierProjectCallable))))

(defn shutdown
  ""
  ([^HttpJsonProjectStub this]
    (-> this (.shutdown))))

(defn get-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.getProjectCallable))))

(defn enable-xpn-host-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.enableXpnHostProjectCallable))))

(defn get-xpn-host-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.getXpnHostProjectCallable))))

(defn close
  ""
  ([^HttpJsonProjectStub this]
    (-> this (.close))))

(defn get-xpn-resources-projects-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.getXpnResourcesProjectsPagedCallable))))

(defn list-xpn-hosts-projects-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.XpnHostList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.listXpnHostsProjectsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonProjectStub this]
    (-> this (.isTerminated))))

(defn get-xpn-resources-projects-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectsGetXpnResources>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.getXpnResourcesProjectsCallable))))

(defn move-disk-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.MoveDiskProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.moveDiskProjectCallable))))

(defn disable-xpn-resource-project-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonProjectStub this]
    (-> this (.disableXpnResourceProjectCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonProjectStub this]
    (-> this (.shutdownNow))))

