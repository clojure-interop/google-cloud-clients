(ns com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminClient
  "Client for creating, configuring and deleting Cloud Bigtable instances, app profiles, and
  clusters.

  See the individual methods for example code.



  try(BigtableInstanceAdminClient client =  BigtableInstanceAdminClient.create(\"my-project\")) {
    CreateInstanceRequest request = CreateInstanceRequest.of(\"my-instance\")
      .addCluster(\"my-cluster\", \"us-east1-c\", 3, StorageType.SSD);

    Instance instance = client.createInstance(request);
  }

  Note: close() needs to be called on the client object to clean up resources such as threads.
  In the example above, try-with-resources is used, which automatically calls close().

  This class can be customized by passing in a custom instance of BigtableInstanceAdminSettings
  to create(). For example:

  To customize credentials:



  BigtableInstanceAdminSettings settings = BigtableInstanceAdminSettings.newBuilder()
    .setProjectId(\"my-project\")
    .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
    .build();

  BigtableInstanceAdminClient client = BigtableInstanceAdminClient.create(settings);

  To customize the endpoint:



  BigtableInstanceAdminSettings.Builder settingsBuilder = BigtableInstanceAdminSettings.newBuilder()
    .setProjectId(\"my-project\");

  settingsBuilder.stubSettings()
    .setEndpoint(myEndpoint);

  BigtableInstanceAdminClient client = BigtableInstanceAdminClient.create(settingsBuilder.build());"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2 BigtableInstanceAdminClient]))

(defn *create
  "Constructs an instance of BigtableInstanceAdminClient with the given project ID and stub.

  project-id - `java.lang.String`
  stub - `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStub`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminClient`"
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminClient [^java.lang.String project-id ^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStub stub]
    (BigtableInstanceAdminClient/create project-id stub))
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminClient [^java.lang.String project-id]
    (BigtableInstanceAdminClient/create project-id)))

(defn get-project-id
  "Gets the project ID this client is associated with.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableInstanceAdminClient this]
    (-> this (.getProjectId))))

(defn delete-app-profile
  "Deletes the specified app profile.

   Sample code:



   client.deleteAppProfile(\"my-instance\", \"my-app-profile\");

  instance-id - `java.lang.String`
  app-profile-id - `java.lang.String`"
  ([^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String app-profile-id]
    (-> this (.deleteAppProfile instance-id app-profile-id))))

(defn create-app-profile
  "Creates a new app profile.

   Sample code:



   AppProfile appProfile = client.createAppProfile(
     CreateAppProfileRequest.of(\"my-instance\", \"my-new-app-profile\")
       .setRoutingPolicy(SingleClusterRoutingPolicy.of(\"my-cluster\"))
   );

  request - `com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest request]
    (-> this (.createAppProfile request))))

(defn delete-app-profile-async
  "Asynchronously deletes the specified app profile.

   Sample code:



   ApiFuture<Void> deleteFuture = client.deleteAppProfileAsync(\"my-instance\", \"my-app-profile\");

   deleteFuture.get();

  instance-id - `java.lang.String`
  app-profile-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String app-profile-id]
    (-> this (.deleteAppProfileAsync instance-id app-profile-id))))

(defn create-cluster-async
  "Asynchronously creates a new cluster in the specified instance.

   Sample code:



   ApiFuture<Cluster> clusterFuture = client.createClusterAsync(
     CreateClusterRequest.of(\"my-instance\", \"my-new-cluster\")
       .setZone(\"us-east1-c\")
       .setServeNodes(3)
       .setStorageType(StorageType.SSD)
   );

   Cluster cluster = clusterFuture.get();

  request - `com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Cluster>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn set-iam-policy
  "Replaces the IAM policy associated with the specified instance.

   Sample code:



   Policy newPolicy = client.setIamPolicy(\"my-instance\",
     Policy.newBuilder()
       .addIdentity(Role.of(\"bigtable.user\"), Identity.user(\"someone@example.com\"))
       .addIdentity(Role.of(\"bigtable.admin\"), Identity.group(\"admins@example.com\"))
       .build());

  instance-id - `java.lang.String`
  policy - `com.google.cloud.Policy`

  returns: `com.google.cloud.Policy`"
  (^com.google.cloud.Policy [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^com.google.cloud.Policy policy]
    (-> this (.setIamPolicy instance-id policy))))

(defn test-iam-permission-async
  "Asynchronously tests whether the caller has the given permissions for the specified instance.
   Returns a subset of the specified permissions that the caller has.

   Sample code:



   ApiFuture<List<String>> grantedPermissionsFuture = client.testIamPermissionAsync(\"my-instance\",
     \"bigtable.tables.readRows\", \"bigtable.tables.mutateRows\");

   ApiFutures.addCallback(grantedPermissionsFuture,
     new ApiFutureCallback<List<String>>() {
       public void onSuccess(List<String> grantedPermissions) {
         System.out.println(\"Has read access: \"  grantedPermissions.contains(\"bigtable.tables.readRows\"));
         System.out.println(\"Has write access: \"  grantedPermissions.contains(\"bigtable.tables.mutateRows\"));
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor());

  instance-id - `java.lang.String`
  permissions - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.util.List<java.lang.String>>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String permissions]
    (-> this (.testIamPermissionAsync instance-id permissions))))

(defn create-instance
  "Creates a new instance and returns its representation.

   Sample code:



   Instance instance = client.createInstance(
     CreateInstanceRequest.of(\"my-instance\")
       .addCluster(\"my-cluster\", \"us-east1-c\", 3, StorageType.SSD)
   );

  request - `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest request]
    (-> this (.createInstance request))))

(defn update-app-profile-async
  "Asynchronously updates an existing app profile.

   Sample code:



   ApiFuture<AppProfile> existingAppProfileFuture = client.getAppProfileAsync(\"my-instance\", \"my-app-profile\");

   ApiFuture<AppProfile> updatedAppProfileFuture = ApiFutures.transformAsync(
     existingAppProfileFuture,
     new ApiAsyncFunction<AppProfile, AppProfile>() {
       public ApiFuture<AppProfile> apply(AppProfile existingAppProfile) {
         return client.updateAppProfileAsync(
           UpdateAppProfileRequest.of(existingAppProfile)
             .setRoutingPolicy(SingleClusterRoutingPolicy.of(\"my-other-cluster\"))
         );
       }
     },
     MoreExecutors.directExecutor()
   );

   ApiFuture<AppProfile> appProfile = updatedAppProfileFuture.get();

  request - `com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.AppProfile>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest request]
    (-> this (.updateAppProfileAsync request))))

(defn list-instances
  "Lists all of the instances in the current project.

   This method will throw a PartialListInstancesException when any zone is unavailable.
   If a partial list is OK, the exception can be caught and inspected.

   Sample code:



   try {
     List<Instance> instances = client.listInstances();
   } catch (PartialListInstancesException e) {
     System.out.println(\"The following zones are unavailable: \"  e.getUnavailableZones());
     System.out.println(\"But the following instances are reachable: \"  e.getInstances());
   }

  returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.Instance>`"
  (^java.util.List [^BigtableInstanceAdminClient this]
    (-> this (.listInstances))))

(defn create-app-profile-async
  "Asynchronously creates a new app profile.

   Sample code:



   ApiFuture<AppProfile> appProfileFuture = client.createAppProfileAsync(
     CreateAppProfileRequest.of(\"my-instance\", \"my-new-app-profile\")
       .setRoutingPolicy(SingleClusterRoutingPolicy.of(\"my-cluster\"))
   );

   AppProfile appProfile = appProfileFuture.get();

  request - `com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.AppProfile>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest request]
    (-> this (.createAppProfileAsync request))))

(defn create-instance-async
  "Asynchronously creates a new instance and returns its representation wrapped in a future.

   Sample code:



   ApiFuture<Instance> instanceFuture = client.createInstanceAsync(
     CreateInstanceRequest.of(\"my-instance\")
       .addCluster(\"my-cluster\", \"us-east1-c\", 3, StorageType.SSD)
   );

   Instance instance = instanceFuture.get();

  request - `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Instance>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest request]
    (-> this (.createInstanceAsync request))))

(defn delete-cluster-async
  "Asynchronously deletes the specified cluster. Please note that an instance must have at least 1
   cluster. To remove the last cluster, please use deleteInstanceAsync(String).

   Sample code:



   ApiFuture<Void> future = client.deleteClusterAsync(\"my-instance\", \"my-cluster\");
   future.get();

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String cluster-id]
    (-> this (.deleteClusterAsync instance-id cluster-id))))

(defn get-instance-async
  "Asynchronously gets the instance representation by ID wrapped in a future.

   Sample code:



   ApiFuture<Instance> instanceFuture = client.getInstanceAsync(\"my-instance\");
   Instance instance = instanceFuture.get();

  instance-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Instance>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.getInstanceAsync instance-id))))

(defn delete-instance
  "Deletes the specified instance.

   Sample code:



   client.deleteInstance(\"my-instance\");

  instance-id - `java.lang.String`"
  ([^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.deleteInstance instance-id))))

(defn resize-cluster-async
  "Asynchronously modifies the cluster's node count. Please note that only clusters that belong to
   a production instance can be resized.



   ApiFuture<Cluster> clusterFuture = client.resizeCluster(\"my-instance\", \"my-cluster\", 30);
   Cluster cluster = clusterFuture.get();

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`
  num-serve-nodes - `int`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Cluster>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String cluster-id ^Integer num-serve-nodes]
    (-> this (.resizeClusterAsync instance-id cluster-id num-serve-nodes))))

(defn get-instance
  "Get the instance representation by ID.

   Sample code:



   Instance instance = client.getInstance(\"my-instance\");

  id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance [^BigtableInstanceAdminClient this ^java.lang.String id]
    (-> this (.getInstance id))))

(defn list-instances-async
  "Asynchronously lists all of the instances in the current project.

   This method will throw a PartialListInstancesException when any zone is unavailable.
   If a partial list is OK, the exception can be caught and inspected.

   Sample code:



   ApiFuture<Instance> instancesFuture = client.listInstancesAsync();

   ApiFutures.addCallback(instancesFuture, new ApiFutureCallback<List<Instance>>() {
     public void onFailure(Throwable t) {
       if (t instanceof PartialListInstancesException) {
         PartialListInstancesException partialError = (PartialListInstancesException)t;
         System.out.println(\"The following zones are unavailable: \"  partialError.getUnavailableZones());
         System.out.println(\"But the following instances are reachable: \"  partialError.getInstances());
       } else {
         t.printStackTrace();
       }
     }

     public void onSuccess(List<Instance> result) {
       System.out.println(\"Found a complete set of instances: \"  result);
     }
   }, MoreExecutors.directExecutor());

  returns: `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.bigtable.admin.v2.models.Instance>>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this]
    (-> this (.listInstancesAsync))))

(defn delete-instance-async
  "Asynchronously deletes the specified instance.

   Sample code:



   ApiFuture<Void> deleteFuture = client.deleteInstanceAsync(\"my-instance\");
   deleteFuture.get();

  instance-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.deleteInstanceAsync instance-id))))

(defn update-instance
  "Updates a new instance and returns its representation.

   Sample code:



   Instance instance = client.updateInstance(
     UpdateInstanceRequest.of(\"my-instance\")
       .setProductionType()
   );

  request - `com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest request]
    (-> this (.updateInstance request))))

(defn list-app-profiles
  "Lists all app profiles of the specified instance.

   Sample code:



   List<AppProfile> appProfiles = client.listAppProfiles(\"my-instance\");

  instance-id - `java.lang.String`

  returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.AppProfile>`"
  (^java.util.List [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.listAppProfiles instance-id))))

(defn list-clusters-async
  "Asynchronously lists all clusters in the specified instance.

   This method will throw a PartialListClustersException when any zone is unavailable.
   If a partial list is OK, the exception can be caught and inspected.

   Sample code:



   ApiFuture<Cluster> clustersFuture = client.listClustersAsync(\"my-instance\");

   ApiFutures.addCallback(clustersFuture, new ApiFutureCallback<List<Cluster>>() {
     public void onFailure(Throwable t) {
       if (t instanceof PartialListClustersException) {
         PartialListClustersException partialError = (PartialListClustersException)t;
         System.out.println(\"The following zones are unavailable: \"  partialError.getUnavailableZones());
         System.out.println(\"But the following clusters are reachable: \"  partialError.getClusters());
       } else {
         t.printStackTrace();
       }
     }

     public void onSuccess(List<Cluster> result) {
       System.out.println(\"Found a complete set of instances: \"  result);
     }
   }, MoreExecutors.directExecutor());

  instance-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.bigtable.admin.v2.models.Cluster>>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.listClustersAsync instance-id))))

(defn close
  "Closes the client and frees all resources associated with it (like thread pools)."
  ([^BigtableInstanceAdminClient this]
    (-> this (.close))))

(defn get-iam-policy
  "Gets the IAM access control policy for the specified instance.

   Sample code:



   Policy policy = client.getIamPolicy(\"my-instance\");
   for(Map.Entry<Role, Set<Identity>> entry : policy.getBindings().entrySet()) {
     System.out.printf(\"Role: %s Identities: %s\\n\", entry.getKey(), entry.getValue());
   }

  instance-id - `java.lang.String`

  returns: `com.google.cloud.Policy`"
  (^com.google.cloud.Policy [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.getIamPolicy instance-id))))

(defn create-cluster
  "Creates a new cluster in the specified instance.

   Sample code:



   Cluster cluster = client.createCluster(
     CreateClusterRequest.of(\"my-instance\", \"my-new-cluster\")
       .setZone(\"us-east1-c\")
       .setServeNodes(3)
       .setStorageType(StorageType.SSD)
   );

  request - `com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.Cluster`"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn update-app-profile
  "Updates an existing app profile.

   Sample code:



   AppProfile existingAppProfile = client.getAppProfile(\"my-instance\", \"my-app-profile\");

   AppProfile updatedAppProfile = client.updateAppProfile(
     UpdateAppProfileRequest.of(existingAppProfile)
       .setRoutingPolicy(SingleClusterRoutingPolicy.of(\"my-cluster\"))
   );

  request - `com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest`

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest request]
    (-> this (.updateAppProfile request))))

(defn get-iam-policy-async
  "Asynchronously gets the IAM access control policy for the specified instance.

   Sample code:



   ApiFuture<Policy> policyFuture = client.getIamPolicyAsync(\"my-instance\");

   ApiFutures.addCallback(policyFuture,
     new ApiFutureCallback<Policy>() {
       public void onSuccess(Policy policy) {
         for (Entry<Role, Set<Identity>> entry : policy.getBindings().entrySet()) {
           System.out.printf(\"Role: %s Identities: %s\\n\", entry.getKey(), entry.getValue());
         }
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor());

  instance-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.Policy>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.getIamPolicyAsync instance-id))))

(defn get-app-profile
  "Gets the app profile by ID.

   Sample code:



   AppProfile appProfile = client.getAppProfile(\"my-instance\", \"my-app-profile\");

  instance-id - `java.lang.String`
  app-profile-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String app-profile-id]
    (-> this (.getAppProfile instance-id app-profile-id))))

(defn resize-cluster
  "Modifies the cluster's node count. Please note that only clusters that belong to a production
   instance can be resized.

   Sample code:



   Cluster cluster = client.resizeCluster(\"my-instance\", \"my-cluster\", 30);

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`
  num-serve-nodes - `int`

  returns: `com.google.cloud.bigtable.admin.v2.models.Cluster`"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String cluster-id ^Integer num-serve-nodes]
    (-> this (.resizeCluster instance-id cluster-id num-serve-nodes))))

(defn exists?
  "Checks if the instance specified by the instance ID exists.

   Sample code:



   if(client.exists(\"my-instance\")) {
     System.out.println(\"Instance exists\");
   }

  instance-id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.exists instance-id))))

(defn delete-cluster
  "Deletes the specified cluster. Please note that an instance must have at least 1 cluster. To
   remove the last cluster, please use deleteInstance(String).

   Sample code:



   client.deleteCluster(\"my-instance\", \"my-cluster\");

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`"
  ([^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String cluster-id]
    (-> this (.deleteCluster instance-id cluster-id))))

(defn test-iam-permission
  "Tests whether the caller has the given permissions for the specified instance. Returns a subset
   of the specified permissions that the caller has.

   Sample code:



   List<String> grantedPermissions = client.testIamPermission(\"my-instance\",
     \"bigtable.tables.readRows\", \"bigtable.tables.mutateRows\");

   System.out.println(\"Has read access: \"
   grantedPermissions.contains(\"bigtable.tables.readRows\")); System.out.println(\"Has write access:
   \"  grantedPermissions.contains(\"bigtable.tables.mutateRows\"));

  instance-id - `java.lang.String`
  permissions - `java.lang.String`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String permissions]
    (-> this (.testIamPermission instance-id permissions))))

(defn get-cluster
  "Gets the cluster representation by ID.

   Sample code:



   Cluster cluster = client.getCluster(\"my-instance\", \"my-cluster\");

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.Cluster`"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String cluster-id]
    (-> this (.getCluster instance-id cluster-id))))

(defn update-instance-async
  "Asynchronously updates a new instance and returns its representation wrapped in a future.

   Sample code:



   ApiFuture<Instance> instanceFuture = client.updateInstanceAsync(
     UpdateInstanceRequest.of(\"my-instance\")
       .setProductionType()
   );

   Instance instance = instanceFuture.get();

  request - `com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Instance>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest request]
    (-> this (.updateInstanceAsync request))))

(defn exists-async
  "Asynchronously checks if the instance specified by the instance ID exists.

   Sample code:



   ApiFuture<Boolean> found = client.existsAsync(\"my-instance\");

   ApiFutures.addCallback(
    found,
    new ApiFutureCallback<Boolean>() {
      public void onSuccess(Boolean found) {
        if (found) {
          System.out.println(\"Instance exists\");
        } else {
          System.out.println(\"Instance not found\");
        }
      }

      public void onFailure(Throwable t) {
        t.printStackTrace();
      }
    },
    MoreExecutors.directExecutor()
   );

  instance-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.existsAsync instance-id))))

(defn get-cluster-async
  "Asynchronously gets the cluster representation by ID.

   Sample code:



   ApiFuture<Cluster> clusterFuture = client.getClusterAsync(\"my-instance\", \"my-cluster\");
   Cluster cluster = clusterFuture.get();

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.Cluster>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String cluster-id]
    (-> this (.getClusterAsync instance-id cluster-id))))

(defn get-app-profile-async
  "Asynchronously gets the app profile by ID.

   Sample code:



   ApiFuture<AppProfile> appProfileFuture = client.getAppProfileAsync(\"my-instance\", \"my-app-profile\");

   AppProfile appProfile = appProfileFuture.get();

  instance-id - `java.lang.String`
  app-profile-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.bigtable.admin.v2.models.AppProfile>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^java.lang.String app-profile-id]
    (-> this (.getAppProfileAsync instance-id app-profile-id))))

(defn set-iam-policy-async
  "Asynchronously replaces the IAM policy associated with the specified instance.

   Sample code:



   ApiFuture<Policy> newPolicyFuture = client.setIamPolicyAsync(\"my-instance\",
     Policy.newBuilder()
       .addIdentity(Role.of(\"bigtable.user\"), Identity.user(\"someone@example.com\"))
       .addIdentity(Role.of(\"bigtable.admin\"), Identity.group(\"admins@example.com\"))
       .build());

   ApiFutures.addCallback(policyFuture,
     new ApiFutureCallback<Policy>() {
       public void onSuccess(Policy policy) {
         for (Entry<Role, Set<Identity>> entry : policy.getBindings().entrySet()) {
           System.out.printf(\"Role: %s Identities: %s\\n\", entry.getKey(), entry.getValue());
         }
       }

       public void onFailure(Throwable t) {
         t.printStackTrace();
       }
     },
     MoreExecutors.directExecutor());

  instance-id - `java.lang.String`
  policy - `com.google.cloud.Policy`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.Policy>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id ^com.google.cloud.Policy policy]
    (-> this (.setIamPolicyAsync instance-id policy))))

(defn list-app-profiles-async
  "Asynchronously lists all app profiles of the specified instance.

   Sample code:



   ApiFuture<List<AppProfile>> appProfilesFuture = client.listAppProfilesAsync(\"my-instance\");

   List<AppProfile> appProfiles = appProfileFuture.get();

  instance-id - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.bigtable.admin.v2.models.AppProfile>>`"
  (^com.google.api.core.ApiFuture [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.listAppProfilesAsync instance-id))))

(defn list-clusters
  "Lists all clusters in the specified instance.

   This method will throw a PartialListClustersException when any zone is unavailable.
   If a partial list is OK, the exception can be caught and inspected.

   Sample code:



   try {
     List<Cluster> clusters = client.listClusters(\"my-instance\");
   } catch (PartialListClustersException e) {
     System.out.println(\"The following zones are unavailable: \"  e.getUnavailableZones());
     System.out.println(\"But the following clusters are reachable: \"  e.getClusters())
   }

  instance-id - `java.lang.String`

  returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.Cluster>`"
  (^java.util.List [^BigtableInstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.listClusters instance-id))))

