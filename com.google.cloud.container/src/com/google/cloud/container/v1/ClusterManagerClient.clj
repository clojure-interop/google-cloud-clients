(ns com.google.cloud.container.v1.ClusterManagerClient
  "Service Description: Google Kubernetes Engine Cluster Manager v1

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
    String projectId = \"\";
    String zone = \"\";
    ListClustersResponse response = clusterManagerClient.listClusters(projectId, zone);
  }

  Note: close() needs to be called on the clusterManagerClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of ClusterManagerSettings to
  create(). For example:

  To customize credentials:



  ClusterManagerSettings clusterManagerSettings =
      ClusterManagerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ClusterManagerClient clusterManagerClient =
      ClusterManagerClient.create(clusterManagerSettings);

  To customize the endpoint:



  ClusterManagerSettings clusterManagerSettings =
      ClusterManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
  ClusterManagerClient clusterManagerClient =
      ClusterManagerClient.create(clusterManagerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.container.v1 ClusterManagerClient]))

(defn *create
  "Constructs an instance of ClusterManagerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.container.v1.ClusterManagerSettings`

  returns: `com.google.cloud.container.v1.ClusterManagerClient`

  throws: java.io.IOException"
  (^com.google.cloud.container.v1.ClusterManagerClient [^com.google.cloud.container.v1.ClusterManagerSettings settings]
    (ClusterManagerClient/create settings))
  (^com.google.cloud.container.v1.ClusterManagerClient []
    (ClusterManagerClient/create )))

(defn get-server-config-callable
  "Returns configuration info about the Kubernetes Engine service.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     GetServerConfigRequest request = GetServerConfigRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .build();
     ApiFuture<ServerConfig> future = clusterManagerClient.getServerConfigCallable().futureCall(request);
     // Do something
     ServerConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetServerConfigRequest,com.google.container.v1.ServerConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.getServerConfigCallable))))

(defn set-labels
  "Sets labels on a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     Map<String, String> resourceLabels = new HashMap<>();
     String labelFingerprint = \"\";
     SetLabelsRequest request = SetLabelsRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .putAllResourceLabels(resourceLabels)
       .setLabelFingerprint(labelFingerprint)
       .build();
     Operation response = clusterManagerClient.setLabels(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.container.v1.SetLabelsRequest`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetLabelsRequest request]
    (-> this (.setLabels request))))

(defn update-node-pool
  "Updates the version and/or image type for a specific node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     String nodeVersion = \"\";
     String imageType = \"\";
     UpdateNodePoolRequest request = UpdateNodePoolRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setNodeVersion(nodeVersion)
       .setImageType(imageType)
       .build();
     Operation response = clusterManagerClient.updateNodePool(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.container.v1.UpdateNodePoolRequest`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.UpdateNodePoolRequest request]
    (-> this (.updateNodePool request))))

(defn list-clusters-callable
  "Lists all clusters owned by a project in either the specified zone or all zones.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     ListClustersRequest request = ListClustersRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .build();
     ApiFuture<ListClustersResponse> future = clusterManagerClient.listClustersCallable().futureCall(request);
     // Do something
     ListClustersResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListClustersRequest,com.google.container.v1.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.listClustersCallable))))

(defn set-node-pool-management-callable
  "Sets the NodeManagement options for a node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     NodeManagement management = NodeManagement.newBuilder().build();
     SetNodePoolManagementRequest request = SetNodePoolManagementRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setManagement(management)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setNodePoolManagementCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolManagementRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setNodePoolManagementCallable))))

(defn set-legacy-abac-callable
  "Enables or disables the ABAC authorization mechanism on a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     boolean enabled = false;
     SetLegacyAbacRequest request = SetLegacyAbacRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setEnabled(enabled)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setLegacyAbacCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLegacyAbacRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setLegacyAbacCallable))))

(defn create-node-pool-callable
  "Creates a node pool for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     NodePool nodePool = NodePool.newBuilder().build();
     CreateNodePoolRequest request = CreateNodePoolRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePool(nodePool)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.createNodePoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CreateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.createNodePoolCallable))))

(defn create-cluster-callable
  "Creates a cluster, consisting of the specified number and type of Google Compute Engine
   instances.

   By default, the cluster is created in the project's [default
   network](/compute/docs/networks-and-firewalls#networks).

   One firewall is added for the cluster. After cluster creation, the cluster creates routes
   for each node to allow the containers on that node to communicate with all other instances in
   the cluster.

   Finally, an entry is added to the project's global metadata indicating which CIDR range is
   being used by the cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     CreateClusterRequest request = CreateClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setCluster(cluster)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.createClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CreateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.createClusterCallable))))

(defn list-node-pools-callable
  "Lists the node pools for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     ListNodePoolsRequest request = ListNodePoolsRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .build();
     ApiFuture<ListNodePoolsResponse> future = clusterManagerClient.listNodePoolsCallable().futureCall(request);
     // Do something
     ListNodePoolsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListNodePoolsRequest,com.google.container.v1.ListNodePoolsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.listNodePoolsCallable))))

(defn complete-ip-rotation
  "Completes master IP rotation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     Operation response = clusterManagerClient.completeIPRotation(projectId, zone, clusterId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id]
    (-> this (.completeIPRotation project-id zone cluster-id)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.CompleteIPRotationRequest request]
    (-> this (.completeIPRotation request))))

(defn set-node-pool-size
  "Sets the size for a specific node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     int nodeCount = 0;
     SetNodePoolSizeRequest request = SetNodePoolSizeRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setNodeCount(nodeCount)
       .build();
     Operation response = clusterManagerClient.setNodePoolSize(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.container.v1.SetNodePoolSizeRequest`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetNodePoolSizeRequest request]
    (-> this (.setNodePoolSize request))))

(defn set-maintenance-policy-callable
  "Sets the maintenance policy for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     MaintenancePolicy maintenancePolicy = MaintenancePolicy.newBuilder().build();
     SetMaintenancePolicyRequest request = SetMaintenancePolicyRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setMaintenancePolicy(maintenancePolicy)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setMaintenancePolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMaintenancePolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setMaintenancePolicyCallable))))

(defn set-legacy-abac
  "Enables or disables the ABAC authorization mechanism on a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     boolean enabled = false;
     Operation response = clusterManagerClient.setLegacyAbac(projectId, zone, clusterId, enabled);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field. - `java.lang.String`
  enabled - Whether ABAC authorization will be enabled in the cluster. - `boolean`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^Boolean enabled]
    (-> this (.setLegacyAbac project-id zone cluster-id enabled)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetLegacyAbacRequest request]
    (-> this (.setLegacyAbac request))))

(defn set-maintenance-policy
  "Sets the maintenance policy for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     MaintenancePolicy maintenancePolicy = MaintenancePolicy.newBuilder().build();
     Operation response = clusterManagerClient.setMaintenancePolicy(projectId, zone, clusterId, maintenancePolicy);
   }

  project-id - The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). - `java.lang.String`
  zone - The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. - `java.lang.String`
  cluster-id - The name of the cluster to update. - `java.lang.String`
  maintenance-policy - The maintenance policy to be set for the cluster. An empty field clears the existing maintenance policy. - `com.google.container.v1.MaintenancePolicy`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^com.google.container.v1.MaintenancePolicy maintenance-policy]
    (-> this (.setMaintenancePolicy project-id zone cluster-id maintenance-policy)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetMaintenancePolicyRequest request]
    (-> this (.setMaintenancePolicy request))))

(defn get-cluster-callable
  "Gets the details of a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     GetClusterRequest request = GetClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .build();
     ApiFuture<Cluster> future = clusterManagerClient.getClusterCallable().futureCall(request);
     // Do something
     Cluster response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetClusterRequest,com.google.container.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.getClusterCallable))))

(defn delete-node-pool
  "Deletes a node pool from a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     Operation response = clusterManagerClient.deleteNodePool(projectId, zone, clusterId, nodePoolId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. - `java.lang.String`
  node-pool-id - Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.lang.String node-pool-id]
    (-> this (.deleteNodePool project-id zone cluster-id node-pool-id)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.DeleteNodePoolRequest request]
    (-> this (.deleteNodePool request))))

(defn set-logging-service-callable
  "Sets the logging service for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String loggingService = \"\";
     SetLoggingServiceRequest request = SetLoggingServiceRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setLoggingService(loggingService)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setLoggingServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLoggingServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setLoggingServiceCallable))))

(defn get-settings
  "returns: `com.google.cloud.container.v1.ClusterManagerSettings`"
  (^com.google.cloud.container.v1.ClusterManagerSettings [^ClusterManagerClient this]
    (-> this (.getSettings))))

(defn set-node-pool-size-callable
  "Sets the size for a specific node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     int nodeCount = 0;
     SetNodePoolSizeRequest request = SetNodePoolSizeRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setNodeCount(nodeCount)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setNodePoolSizeCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolSizeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setNodePoolSizeCallable))))

(defn set-node-pool-autoscaling-callable
  "Sets the autoscaling settings for a specific node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     NodePoolAutoscaling autoscaling = NodePoolAutoscaling.newBuilder().build();
     SetNodePoolAutoscalingRequest request = SetNodePoolAutoscalingRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setAutoscaling(autoscaling)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setNodePoolAutoscalingCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNodePoolAutoscalingRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setNodePoolAutoscalingCallable))))

(defn start-ip-rotation
  "Start master IP rotation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     Operation response = clusterManagerClient.startIPRotation(projectId, zone, clusterId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id]
    (-> this (.startIPRotation project-id zone cluster-id)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.StartIPRotationRequest request]
    (-> this (.startIPRotation request))))

(defn update-cluster-callable
  "Updates the settings of a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     ClusterUpdate update = ClusterUpdate.newBuilder().build();
     UpdateClusterRequest request = UpdateClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setUpdate(update)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.updateClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.updateClusterCallable))))

(defn set-locations-callable
  "Sets the locations for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     List<String> locations = new ArrayList<>();
     SetLocationsRequest request = SetLocationsRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .addAllLocations(locations)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setLocationsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLocationsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setLocationsCallable))))

(defn set-locations
  "Sets the locations for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     List<String> locations = new ArrayList<>();
     Operation response = clusterManagerClient.setLocations(projectId, zone, clusterId, locations);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. - `java.lang.String`
  locations - The desired list of Google Compute Engine [locations](/compute/docs/zones#available) in which the cluster's nodes should be located. Changing the locations a cluster is in will result in nodes being either created or removed from the cluster, depending on whether locations are being added or removed. This list must always include the cluster's primary zone. - `java.util.List`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.util.List locations]
    (-> this (.setLocations project-id zone cluster-id locations)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetLocationsRequest request]
    (-> this (.setLocations request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.container.v1.stub.ClusterManagerStub`"
  ([^ClusterManagerClient this]
    (-> this (.getStub))))

(defn set-node-pool-management
  "Sets the NodeManagement options for a node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     NodeManagement management = NodeManagement.newBuilder().build();
     SetNodePoolManagementRequest request = SetNodePoolManagementRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setManagement(management)
       .build();
     Operation response = clusterManagerClient.setNodePoolManagement(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.container.v1.SetNodePoolManagementRequest`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetNodePoolManagementRequest request]
    (-> this (.setNodePoolManagement request))))

(defn cancel-operation-callable
  "Cancels the specified operation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String operationId = \"\";
     CancelOperationRequest request = CancelOperationRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setOperationId(operationId)
       .build();
     ApiFuture<Void> future = clusterManagerClient.cancelOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CancelOperationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.cancelOperationCallable))))

(defn rollback-node-pool-upgrade
  "Roll back the previously Aborted or Failed NodePool upgrade. This will be an no-op if the last
   upgrade successfully completed.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     Operation response = clusterManagerClient.rollbackNodePoolUpgrade(projectId, zone, clusterId, nodePoolId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by the name field. - `java.lang.String`
  node-pool-id - Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.lang.String node-pool-id]
    (-> this (.rollbackNodePoolUpgrade project-id zone cluster-id node-pool-id)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.RollbackNodePoolUpgradeRequest request]
    (-> this (.rollbackNodePoolUpgrade request))))

(defn set-node-pool-autoscaling
  "Sets the autoscaling settings for a specific node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     NodePoolAutoscaling autoscaling = NodePoolAutoscaling.newBuilder().build();
     SetNodePoolAutoscalingRequest request = SetNodePoolAutoscalingRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setAutoscaling(autoscaling)
       .build();
     Operation response = clusterManagerClient.setNodePoolAutoscaling(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.container.v1.SetNodePoolAutoscalingRequest`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetNodePoolAutoscalingRequest request]
    (-> this (.setNodePoolAutoscaling request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ClusterManagerClient this]
    (-> this (.isShutdown))))

(defn complete-ip-rotation-callable
  "Completes master IP rotation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     CompleteIPRotationRequest request = CompleteIPRotationRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.completeIPRotationCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.CompleteIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.completeIPRotationCallable))))

(defn get-server-config
  "Returns configuration info about the Kubernetes Engine service.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     ServerConfig response = clusterManagerClient.getServerConfig(projectId, zone);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) to return operations for. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.ServerConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.ServerConfig [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone]
    (-> this (.getServerConfig project-id zone)))
  (^com.google.container.v1.ServerConfig [^ClusterManagerClient this ^com.google.container.v1.GetServerConfigRequest request]
    (-> this (.getServerConfig request))))

(defn set-labels-callable
  "Sets labels on a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     Map<String, String> resourceLabels = new HashMap<>();
     String labelFingerprint = \"\";
     SetLabelsRequest request = SetLabelsRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .putAllResourceLabels(resourceLabels)
       .setLabelFingerprint(labelFingerprint)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setLabelsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetLabelsRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setLabelsCallable))))

(defn set-network-policy-callable
  "Enables/Disables Network Policy for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     NetworkPolicy networkPolicy = NetworkPolicy.newBuilder().build();
     SetNetworkPolicyRequest request = SetNetworkPolicyRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNetworkPolicy(networkPolicy)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setNetworkPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetNetworkPolicyRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setNetworkPolicyCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ClusterManagerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ClusterManagerClient this]
    (-> this (.shutdown))))

(defn start-ip-rotation-callable
  "Start master IP rotation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     StartIPRotationRequest request = StartIPRotationRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.startIPRotationCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.StartIPRotationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.startIPRotationCallable))))

(defn list-node-pools
  "Lists the node pools for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     ListNodePoolsResponse response = clusterManagerClient.listNodePools(projectId, zone, clusterId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. - `java.lang.String`

  returns: `com.google.container.v1.ListNodePoolsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.ListNodePoolsResponse [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id]
    (-> this (.listNodePools project-id zone cluster-id)))
  (^com.google.container.v1.ListNodePoolsResponse [^ClusterManagerClient this ^com.google.container.v1.ListNodePoolsRequest request]
    (-> this (.listNodePools request))))

(defn delete-cluster-callable
  "Deletes the cluster, including the Kubernetes endpoint and all worker nodes.

   Firewalls and routes that were configured during cluster creation are also deleted.

   Other Google Compute Engine resources that might be in use by the cluster (e.g. load
   balancer resources) will not be deleted if they weren't present at the initial create time.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     DeleteClusterRequest request = DeleteClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.deleteClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.DeleteClusterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.deleteClusterCallable))))

(defn set-master-auth
  "Used to set master auth materials. Currently supports :- Changing the admin password for a
   specific cluster. This can be either via password generation or explicitly set the password.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     SetMasterAuthRequest.Action action = SetMasterAuthRequest.Action.UNKNOWN;
     MasterAuth update = MasterAuth.newBuilder().build();
     SetMasterAuthRequest request = SetMasterAuthRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setAction(action)
       .setUpdate(update)
       .build();
     Operation response = clusterManagerClient.setMasterAuth(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.container.v1.SetMasterAuthRequest`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetMasterAuthRequest request]
    (-> this (.setMasterAuth request))))

(defn set-addons-config-callable
  "Sets the addons for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     AddonsConfig addonsConfig = AddonsConfig.newBuilder().build();
     SetAddonsConfigRequest request = SetAddonsConfigRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setAddonsConfig(addonsConfig)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setAddonsConfigCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetAddonsConfigRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setAddonsConfigCallable))))

(defn delete-node-pool-callable
  "Deletes a node pool from a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     DeleteNodePoolRequest request = DeleteNodePoolRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.deleteNodePoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.DeleteNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.deleteNodePoolCallable))))

(defn get-operation-callable
  "Gets the specified operation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String operationId = \"\";
     GetOperationRequest request = GetOperationRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setOperationId(operationId)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.getOperationCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetOperationRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.getOperationCallable))))

(defn create-node-pool
  "Creates a node pool for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     NodePool nodePool = NodePool.newBuilder().build();
     Operation response = clusterManagerClient.createNodePool(projectId, zone, clusterId, nodePool);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. - `java.lang.String`
  node-pool - The node pool to create. - `com.google.container.v1.NodePool`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^com.google.container.v1.NodePool node-pool]
    (-> this (.createNodePool project-id zone cluster-id node-pool)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.CreateNodePoolRequest request]
    (-> this (.createNodePool request))))

(defn close
  ""
  ([^ClusterManagerClient this]
    (-> this (.close))))

(defn set-addons-config
  "Sets the addons for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     AddonsConfig addonsConfig = AddonsConfig.newBuilder().build();
     Operation response = clusterManagerClient.setAddonsConfig(projectId, zone, clusterId, addonsConfig);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. - `java.lang.String`
  addons-config - The desired configurations for the various addons available to run in the cluster. - `com.google.container.v1.AddonsConfig`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^com.google.container.v1.AddonsConfig addons-config]
    (-> this (.setAddonsConfig project-id zone cluster-id addons-config)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetAddonsConfigRequest request]
    (-> this (.setAddonsConfig request))))

(defn create-cluster
  "Creates a cluster, consisting of the specified number and type of Google Compute Engine
   instances.

   By default, the cluster is created in the project's [default
   network](/compute/docs/networks-and-firewalls#networks).

   One firewall is added for the cluster. After cluster creation, the cluster creates routes
   for each node to allow the containers on that node to communicate with all other instances in
   the cluster.

   Finally, an entry is added to the project's global metadata indicating which CIDR range is
   being used by the cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     Operation response = clusterManagerClient.createCluster(projectId, zone, cluster);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field. - `java.lang.String`
  cluster - A [cluster resource](/container-engine/reference/rest/v1/projects.zones.clusters) - `com.google.container.v1.Cluster`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^com.google.container.v1.Cluster cluster]
    (-> this (.createCluster project-id zone cluster)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn update-cluster
  "Updates the settings of a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     ClusterUpdate update = ClusterUpdate.newBuilder().build();
     Operation response = clusterManagerClient.updateCluster(projectId, zone, clusterId, update);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. - `java.lang.String`
  update - A description of the update. - `com.google.container.v1.ClusterUpdate`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^com.google.container.v1.ClusterUpdate update]
    (-> this (.updateCluster project-id zone cluster-id update)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.UpdateClusterRequest request]
    (-> this (.updateCluster request))))

(defn update-node-pool-callable
  "Updates the version and/or image type for a specific node pool.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     String nodeVersion = \"\";
     String imageType = \"\";
     UpdateNodePoolRequest request = UpdateNodePoolRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .setNodeVersion(nodeVersion)
       .setImageType(imageType)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.updateNodePoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateNodePoolRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.updateNodePoolCallable))))

(defn get-node-pool
  "Retrieves the node pool requested.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     NodePool response = clusterManagerClient.getNodePool(projectId, zone, clusterId, nodePoolId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. - `java.lang.String`
  node-pool-id - Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.NodePool`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.NodePool [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.lang.String node-pool-id]
    (-> this (.getNodePool project-id zone cluster-id node-pool-id)))
  (^com.google.container.v1.NodePool [^ClusterManagerClient this ^com.google.container.v1.GetNodePoolRequest request]
    (-> this (.getNodePool request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ClusterManagerClient this]
    (-> this (.isTerminated))))

(defn delete-cluster
  "Deletes the cluster, including the Kubernetes endpoint and all worker nodes.

   Firewalls and routes that were configured during cluster creation are also deleted.

   Other Google Compute Engine resources that might be in use by the cluster (e.g. load
   balancer resources) will not be deleted if they weren't present at the initial create time.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     Operation response = clusterManagerClient.deleteCluster(projectId, zone, clusterId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id]
    (-> this (.deleteCluster project-id zone cluster-id)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn set-logging-service
  "Sets the logging service for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String loggingService = \"\";
     Operation response = clusterManagerClient.setLoggingService(projectId, zone, clusterId, loggingService);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. - `java.lang.String`
  logging-service - The logging service the cluster should use to write metrics. Currently available options: * \"logging.googleapis.com\" - the Google Cloud Logging service * \"none\" - no metrics will be exported from the cluster - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.lang.String logging-service]
    (-> this (.setLoggingService project-id zone cluster-id logging-service)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetLoggingServiceRequest request]
    (-> this (.setLoggingService request))))

(defn get-node-pool-callable
  "Retrieves the node pool requested.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     GetNodePoolRequest request = GetNodePoolRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .build();
     ApiFuture<NodePool> future = clusterManagerClient.getNodePoolCallable().futureCall(request);
     // Do something
     NodePool response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.GetNodePoolRequest,com.google.container.v1.NodePool>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.getNodePoolCallable))))

(defn get-cluster
  "Gets the details of a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     Cluster response = clusterManagerClient.getCluster(projectId, zone, clusterId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Cluster`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Cluster [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id]
    (-> this (.getCluster project-id zone cluster-id)))
  (^com.google.container.v1.Cluster [^ClusterManagerClient this ^com.google.container.v1.GetClusterRequest request]
    (-> this (.getCluster request))))

(defn get-operation
  "Gets the specified operation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String operationId = \"\";
     Operation response = clusterManagerClient.getOperation(projectId, zone, operationId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  operation-id - Deprecated. The server-assigned `name` of the operation. This field has been deprecated and replaced by the name field. - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String operation-id]
    (-> this (.getOperation project-id zone operation-id)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.GetOperationRequest request]
    (-> this (.getOperation request))))

(defn rollback-node-pool-upgrade-callable
  "Roll back the previously Aborted or Failed NodePool upgrade. This will be an no-op if the last
   upgrade successfully completed.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String nodePoolId = \"\";
     RollbackNodePoolUpgradeRequest request = RollbackNodePoolUpgradeRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setNodePoolId(nodePoolId)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.rollbackNodePoolUpgradeCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.RollbackNodePoolUpgradeRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.rollbackNodePoolUpgradeCallable))))

(defn cancel-operation
  "Cancels the specified operation.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String operationId = \"\";
     clusterManagerClient.cancelOperation(projectId, zone, operationId);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the operation resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  operation-id - Deprecated. The server-assigned `name` of the operation. This field has been deprecated and replaced by the name field. - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String operation-id]
    (-> this (.cancelOperation project-id zone operation-id)))
  ([^ClusterManagerClient this ^com.google.container.v1.CancelOperationRequest request]
    (-> this (.cancelOperation request))))

(defn list-operations-callable
  "Lists all operations in a project in a specific zone or all zones.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     ListOperationsRequest request = ListOperationsRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .build();
     ApiFuture<ListOperationsResponse> future = clusterManagerClient.listOperationsCallable().futureCall(request);
     // Do something
     ListOperationsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.ListOperationsRequest,com.google.container.v1.ListOperationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.listOperationsCallable))))

(defn update-master-callable
  "Updates the master for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String masterVersion = \"\";
     UpdateMasterRequest request = UpdateMasterRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setMasterVersion(masterVersion)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.updateMasterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.UpdateMasterRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.updateMasterCallable))))

(defn shutdown-now
  ""
  ([^ClusterManagerClient this]
    (-> this (.shutdownNow))))

(defn set-monitoring-service
  "Sets the monitoring service for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String monitoringService = \"\";
     Operation response = clusterManagerClient.setMonitoringService(projectId, zone, clusterId, monitoringService);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. - `java.lang.String`
  monitoring-service - The monitoring service the cluster should use to write metrics. Currently available options: * \"monitoring.googleapis.com\" - the Google Cloud Monitoring service * \"none\" - no metrics will be exported from the cluster - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.lang.String monitoring-service]
    (-> this (.setMonitoringService project-id zone cluster-id monitoring-service)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetMonitoringServiceRequest request]
    (-> this (.setMonitoringService request))))

(defn update-master
  "Updates the master for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String masterVersion = \"\";
     Operation response = clusterManagerClient.updateMaster(projectId, zone, clusterId, masterVersion);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. - `java.lang.String`
  master-version - The Kubernetes version to change the master to. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following behavior: - \"latest\": picks the highest valid Kubernetes version - \"1.X\": picks the highest valid patch+gke.N patch in the 1.X version - \"1.X.Y\": picks the highest valid gke.N patch in the 1.X.Y version - \"1.X.Y-gke.N\": picks an explicit Kubernetes version - \"-\": picks the default Kubernetes version - `java.lang.String`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^java.lang.String master-version]
    (-> this (.updateMaster project-id zone cluster-id master-version)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.UpdateMasterRequest request]
    (-> this (.updateMaster request))))

(defn set-master-auth-callable
  "Used to set master auth materials. Currently supports :- Changing the admin password for a
   specific cluster. This can be either via password generation or explicitly set the password.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     SetMasterAuthRequest.Action action = SetMasterAuthRequest.Action.UNKNOWN;
     MasterAuth update = MasterAuth.newBuilder().build();
     SetMasterAuthRequest request = SetMasterAuthRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setAction(action)
       .setUpdate(update)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setMasterAuthCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMasterAuthRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setMasterAuthCallable))))

(defn list-operations
  "Lists all operations in a project in a specific zone or all zones.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     ListOperationsResponse response = clusterManagerClient.listOperations(projectId, zone);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) to return operations for, or `-` for all zones. This field has been deprecated and replaced by the parent field. - `java.lang.String`

  returns: `com.google.container.v1.ListOperationsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.ListOperationsResponse [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone]
    (-> this (.listOperations project-id zone)))
  (^com.google.container.v1.ListOperationsResponse [^ClusterManagerClient this ^com.google.container.v1.ListOperationsRequest request]
    (-> this (.listOperations request))))

(defn set-network-policy
  "Enables/Disables Network Policy for a cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     NetworkPolicy networkPolicy = NetworkPolicy.newBuilder().build();
     Operation response = clusterManagerClient.setNetworkPolicy(projectId, zone, clusterId, networkPolicy);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field. - `java.lang.String`
  cluster-id - Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. - `java.lang.String`
  network-policy - Configuration options for the NetworkPolicy feature. - `com.google.container.v1.NetworkPolicy`

  returns: `com.google.container.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone ^java.lang.String cluster-id ^com.google.container.v1.NetworkPolicy network-policy]
    (-> this (.setNetworkPolicy project-id zone cluster-id network-policy)))
  (^com.google.container.v1.Operation [^ClusterManagerClient this ^com.google.container.v1.SetNetworkPolicyRequest request]
    (-> this (.setNetworkPolicy request))))

(defn list-clusters
  "Lists all clusters owned by a project in either the specified zone or all zones.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     ListClustersResponse response = clusterManagerClient.listClusters(projectId, zone);
   }

  project-id - Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field. - `java.lang.String`
  zone - Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides, or \"-\" for all zones. This field has been deprecated and replaced by the parent field. - `java.lang.String`

  returns: `com.google.container.v1.ListClustersResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.container.v1.ListClustersResponse [^ClusterManagerClient this ^java.lang.String project-id ^java.lang.String zone]
    (-> this (.listClusters project-id zone)))
  (^com.google.container.v1.ListClustersResponse [^ClusterManagerClient this ^com.google.container.v1.ListClustersRequest request]
    (-> this (.listClusters request))))

(defn set-monitoring-service-callable
  "Sets the monitoring service for a specific cluster.

   Sample code:



   try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
     String projectId = \"\";
     String zone = \"\";
     String clusterId = \"\";
     String monitoringService = \"\";
     SetMonitoringServiceRequest request = SetMonitoringServiceRequest.newBuilder()
       .setProjectId(projectId)
       .setZone(zone)
       .setClusterId(clusterId)
       .setMonitoringService(monitoringService)
       .build();
     ApiFuture<Operation> future = clusterManagerClient.setMonitoringServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.container.v1.SetMonitoringServiceRequest,com.google.container.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterManagerClient this]
    (-> this (.setMonitoringServiceCallable))))

