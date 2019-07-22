(ns com.google.cloud.dataproc.v1beta2.ClusterControllerClient
  "Service Description: The ClusterControllerService provides methods to manage clusters of Compute
  Engine instances.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
    String projectId = \"\";
    String region = \"\";
    String clusterName = \"\";
    Cluster response = clusterControllerClient.getCluster(projectId, region, clusterName);
  }

  Note: close() needs to be called on the clusterControllerClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of ClusterControllerSettings to
  create(). For example:

  To customize credentials:



  ClusterControllerSettings clusterControllerSettings =
      ClusterControllerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ClusterControllerClient clusterControllerClient =
      ClusterControllerClient.create(clusterControllerSettings);

  To customize the endpoint:



  ClusterControllerSettings clusterControllerSettings =
      ClusterControllerSettings.newBuilder().setEndpoint(myEndpoint).build();
  ClusterControllerClient clusterControllerClient =
      ClusterControllerClient.create(clusterControllerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 ClusterControllerClient]))

(defn *create
  "Constructs an instance of ClusterControllerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dataproc.v1beta2.ClusterControllerSettings`

  returns: `com.google.cloud.dataproc.v1beta2.ClusterControllerClient`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerClient [^com.google.cloud.dataproc.v1beta2.ClusterControllerSettings settings]
    (ClusterControllerClient/create settings))
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerClient []
    (ClusterControllerClient/create )))

(defn list-clusters-callable
  "Lists all regions/{region}/clusters in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     ListClustersRequest request = ListClustersRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .build();
     while (true) {
       ListClustersResponse response = clusterControllerClient.listClustersCallable().call(request);
       for (Cluster element : response.getClustersList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.listClustersCallable))))

(defn create-cluster-callable
  "Creates a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     CreateClusterRequest request = CreateClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setCluster(cluster)
       .build();
     ApiFuture<Operation> future = clusterControllerClient.createClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.createClusterCallable))))

(defn create-cluster-async
  "Creates a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     Cluster response = clusterControllerClient.createClusterAsync(projectId, region, cluster).get();
   }

  project-id - Required. The ID of the Google Cloud Platform project that the cluster belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  cluster - Required. The cluster to create. - `com.google.cloud.dataproc.v1beta2.Cluster`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region ^com.google.cloud.dataproc.v1beta2.Cluster cluster]
    (-> this (.createClusterAsync project-id region cluster)))
  ([^ClusterControllerClient this ^com.google.cloud.dataproc.v1beta2.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn get-cluster-callable
  "Gets the resource representation for a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     GetClusterRequest request = GetClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .build();
     ApiFuture<Cluster> future = clusterControllerClient.getClusterCallable().futureCall(request);
     // Do something
     Cluster response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.getClusterCallable))))

(defn diagnose-cluster-operation-callable
  "Gets cluster diagnostic information. After the operation completes, the Operation.response
   field contains `DiagnoseClusterOutputLocation`.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     DiagnoseClusterRequest request = DiagnoseClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .build();
     OperationFuture<Empty, DiagnoseClusterResults> future = clusterControllerClient.diagnoseClusterOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.DiagnoseClusterResults>`"
  ([^ClusterControllerClient this]
    (-> this (.diagnoseClusterOperationCallable))))

(defn get-settings
  "returns: `com.google.cloud.dataproc.v1beta2.ClusterControllerSettings`"
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerSettings [^ClusterControllerClient this]
    (-> this (.getSettings))))

(defn diagnose-cluster-callable
  "Gets cluster diagnostic information. After the operation completes, the Operation.response
   field contains `DiagnoseClusterOutputLocation`.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     DiagnoseClusterRequest request = DiagnoseClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .build();
     ApiFuture<Operation> future = clusterControllerClient.diagnoseClusterCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.diagnoseClusterCallable))))

(defn update-cluster-callable
  "Updates a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateClusterRequest request = UpdateClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .setCluster(cluster)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Operation> future = clusterControllerClient.updateClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.updateClusterCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStub`"
  ([^ClusterControllerClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ClusterControllerClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ClusterControllerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-cluster-async
  "Deletes a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     clusterControllerClient.deleteClusterAsync(projectId, region, clusterName).get();
   }

  project-id - Required. The ID of the Google Cloud Platform project that the cluster belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  cluster-name - Required. The cluster name. - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String cluster-name]
    (-> this (.deleteClusterAsync project-id region cluster-name)))
  ([^ClusterControllerClient this ^com.google.cloud.dataproc.v1beta2.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn shutdown
  ""
  ([^ClusterControllerClient this]
    (-> this (.shutdown))))

(defn delete-cluster-callable
  "Deletes a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     DeleteClusterRequest request = DeleteClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .build();
     ApiFuture<Operation> future = clusterControllerClient.deleteClusterCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.deleteClusterCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^ClusterControllerClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^ClusterControllerClient this]
    (-> this (.close))))

(defn diagnose-cluster-async
  "Gets cluster diagnostic information. After the operation completes, the Operation.response
   field contains `DiagnoseClusterOutputLocation`.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     clusterControllerClient.diagnoseClusterAsync(projectId, region, clusterName).get();
   }

  project-id - Required. The ID of the Google Cloud Platform project that the cluster belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  cluster-name - Required. The cluster name. - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.DiagnoseClusterResults>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String cluster-name]
    (-> this (.diagnoseClusterAsync project-id region cluster-name)))
  ([^ClusterControllerClient this ^com.google.cloud.dataproc.v1beta2.DiagnoseClusterRequest request]
    (-> this (.diagnoseClusterAsync request))))

(defn list-clusters-paged-callable
  "Lists all regions/{region}/clusters in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     ListClustersRequest request = ListClustersRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .build();
     ApiFuture<ListClustersPagedResponse> future = clusterControllerClient.listClustersPagedCallable().futureCall(request);
     // Do something
     for (Cluster element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListClustersRequest,com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ClusterControllerClient this]
    (-> this (.listClustersPagedCallable))))

(defn update-cluster-operation-callable
  "Updates a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateClusterRequest request = UpdateClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .setCluster(cluster)
       .setUpdateMask(updateMask)
       .build();
     OperationFuture<Cluster, ClusterOperationMetadata> future = clusterControllerClient.updateClusterOperationCallable().futureCall(request);
     // Do something
     Cluster response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.UpdateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerClient this]
    (-> this (.updateClusterOperationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ClusterControllerClient this]
    (-> this (.isTerminated))))

(defn get-cluster
  "Gets the resource representation for a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     Cluster response = clusterControllerClient.getCluster(projectId, region, clusterName);
   }

  project-id - Required. The ID of the Google Cloud Platform project that the cluster belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  cluster-name - Required. The cluster name. - `java.lang.String`

  returns: `com.google.cloud.dataproc.v1beta2.Cluster`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.Cluster [^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String cluster-name]
    (-> this (.getCluster project-id region cluster-name)))
  (^com.google.cloud.dataproc.v1beta2.Cluster [^ClusterControllerClient this ^com.google.cloud.dataproc.v1beta2.GetClusterRequest request]
    (-> this (.getCluster request))))

(defn update-cluster-async
  "Updates a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Cluster response = clusterControllerClient.updateClusterAsync(projectId, region, clusterName, cluster, updateMask).get();
   }

  project-id - Required. The ID of the Google Cloud Platform project the cluster belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  cluster-name - Required. The cluster name. - `java.lang.String`
  cluster - Required. The changes to the cluster. - `com.google.cloud.dataproc.v1beta2.Cluster`
  update-mask - Required. Specifies the path, relative to `Cluster`, of the field to update. For example, to change the number of workers in a cluster to 5, the `update_mask` parameter would be specified as `config.worker_config.num_instances`, and the `PATCH` request body would specify the new value, as follows: { \"config\":{ \"workerConfig\":{ \"numInstances\":\"5\" } } } Similarly, to change the number of preemptible workers in a cluster to 5, the `update_mask` parameter would be `config.secondary_worker_config.num_instances`, and the `PATCH` request body would be set as follows: { \"config\":{ \"secondaryWorkerConfig\":{ \"numInstances\":\"5\" } } } <strong>Note:</strong> currently only the following fields can be updated: <table> <tr> <td><strong>Mask</strong></td><td><strong>Purpose</strong></td> </tr> <tr> <td>labels</td><td>Updates labels</td> </tr> <tr> <td>config.worker_config.num_instances</td><td>Resize primary worker group</td> </tr> <tr> <td>config.secondary_worker_config.num_instances</td><td>Resize secondary worker group</td> </tr> <tr> <td>config.lifecycle_config.auto_delete_ttl</td><td>Reset MAX TTL duration</td> </tr> <tr> <td>config.lifecycle_config.auto_delete_time</td><td>Update MAX TTL deletion timestamp</td> </tr> <tr> <td>config.lifecycle_config.idle_delete_ttl</td><td>Update Idle TTL duration</td> </tr> <tr> <td>config.autoscaling_config.policy_uri</td><td>Use, stop using, or change autoscaling policies</td> </tr> </table> - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String cluster-name ^com.google.cloud.dataproc.v1beta2.Cluster cluster ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateClusterAsync project-id region cluster-name cluster update-mask)))
  ([^ClusterControllerClient this ^com.google.cloud.dataproc.v1beta2.UpdateClusterRequest request]
    (-> this (.updateClusterAsync request))))

(defn delete-cluster-operation-callable
  "Deletes a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String clusterName = \"\";
     DeleteClusterRequest request = DeleteClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setClusterName(clusterName)
       .build();
     OperationFuture<Empty, ClusterOperationMetadata> future = clusterControllerClient.deleteClusterOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.DeleteClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerClient this]
    (-> this (.deleteClusterOperationCallable))))

(defn shutdown-now
  ""
  ([^ClusterControllerClient this]
    (-> this (.shutdownNow))))

(defn list-clusters
  "Lists all regions/{region}/clusters in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String filter = \"\";
     for (Cluster element : clusterControllerClient.listClusters(projectId, region, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project-id - Required. The ID of the Google Cloud Platform project that the cluster belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  filter - Optional. A filter constraining the clusters to list. Filters are case-sensitive and have the following syntax: field = value [AND [field = value]] ... where **field** is one of `status.state`, `clusterName`, or `labels.[KEY]`, and `[KEY]` is a label key. **value** can be `*` to match all values. `status.state` can be one of the following: `ACTIVE`, `INACTIVE`, `CREATING`, `RUNNING`, `ERROR`, `DELETING`, or `UPDATING`. `ACTIVE` contains the `CREATING`, `UPDATING`, and `RUNNING` states. `INACTIVE` contains the `DELETING` and `ERROR` states. `clusterName` is the name of the cluster provided at creation time. Only the logical `AND` operator is supported; space-separated items are treated as having an implicit `AND` operator. Example filter: status.state = ACTIVE AND clusterName = mycluster AND labels.env = staging AND labels.starred = * - `java.lang.String`

  returns: `com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse [^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String filter]
    (-> this (.listClusters project-id region filter)))
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse [^ClusterControllerClient this ^java.lang.String project-id ^java.lang.String region]
    (-> this (.listClusters project-id region)))
  (^com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse [^ClusterControllerClient this ^com.google.cloud.dataproc.v1beta2.ListClustersRequest request]
    (-> this (.listClusters request))))

(defn create-cluster-operation-callable
  "Creates a cluster in a project.

   Sample code:



   try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     Cluster cluster = Cluster.newBuilder().build();
     CreateClusterRequest request = CreateClusterRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setCluster(cluster)
       .build();
     OperationFuture<Cluster, ClusterOperationMetadata> future = clusterControllerClient.createClusterOperationCallable().futureCall(request);
     // Do something
     Cluster response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.CreateClusterRequest,com.google.cloud.dataproc.v1beta2.Cluster,com.google.cloud.dataproc.v1beta2.ClusterOperationMetadata>`"
  ([^ClusterControllerClient this]
    (-> this (.createClusterOperationCallable))))

