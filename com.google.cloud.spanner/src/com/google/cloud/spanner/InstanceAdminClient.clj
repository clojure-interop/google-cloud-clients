(ns com.google.cloud.spanner.InstanceAdminClient
  "Client to do admin operations on Cloud Spanner Instance and Instance Configs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceAdminClient]))

(defn get-instance-config
  "Gets an instance config.

  config-id - `java.lang.String`

  returns: `com.google.cloud.spanner.InstanceConfig`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.InstanceConfig [^InstanceAdminClient this ^java.lang.String config-id]
    (-> this (.getInstanceConfig config-id))))

(defn list-instance-configs
  "Lists the supported instance configs for current project.

  options - `com.google.cloud.spanner.Options$ListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.spanner.InstanceConfig>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.paging.Page [^InstanceAdminClient this ^com.google.cloud.spanner.Options$ListOption options]
    (-> this (.listInstanceConfigs options))))

(defn create-instance
  "Creates an instance and begins preparing it to begin serving. The returned Operation
   can be used to track the progress of preparing the new instance. The instance name is assigned
   by the caller. If the named instance already exists, a SpannerException is thrown. Immediately
   upon completion of this request:


     The instance is readable via the API, with all requested attributes but no allocated
         resources.
     Its state is CREATING.


   Until completion of the returned operation:


     Cancelling the operation renders the instance immediately unreadable via the API.
     The instance can be deleted.
     All other attempts to modify the instance are rejected.


   Upon completion of the returned operation:


     Billing for all successfully-allocated resources begins (some types may have lower than
         the requested levels).
     Databases can be created in the instance.
     The instance's allocated resource levels are readable via the


   SNIPPET instance_admin_client_create_instance



   final String instanceId = my_instance_id;
   final String configId = my_config_id;
   final String clientProject = my_client_project;

   Operation<Instance, CreateInstanceMetadata> op =
       instanceAdminClient.createInstance(InstanceInfo
           .newBuilder(InstanceId.of(clientProject, instanceId))
           .setInstanceConfigId(InstanceConfigId.of(clientProject, configId))
           .setDisplayName(instanceId)
           .setNodeCount(1)
           .build());
   op.waitFor();

   SNIPPET instance_admin_client_create_instance

  instance - `com.google.cloud.spanner.InstanceInfo`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.cloud.spanner.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^InstanceAdminClient this ^com.google.cloud.spanner.InstanceInfo instance]
    (-> this (.createInstance instance))))

(defn get-instance
  "Gets an instance.

  instance-id - `java.lang.String`

  returns: `com.google.cloud.spanner.Instance`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.Instance [^InstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.getInstance instance-id))))

(defn list-instances
  "Lists the instances.

  options - Options to control the instances returned. It also supports Options.filter(String) option. The fields eligible for filtering are: name display_name labels.key where key is the name of a label SNIPPET instance_admin_client_list_instances List<Instance> instances = Lists.newArrayList( instanceAdminClient.listInstances(Options.pageSize(1)).iterateAll()); SNIPPET instance_admin_client_list_instances - `com.google.cloud.spanner.Options$ListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.spanner.Instance>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.paging.Page [^InstanceAdminClient this ^com.google.cloud.spanner.Options$ListOption options]
    (-> this (.listInstances options))))

(defn delete-instance
  "Deletes an instance.

  instance-id - `java.lang.String`

  throws: com.google.cloud.spanner.SpannerException"
  ([^InstanceAdminClient this ^java.lang.String instance-id]
    (-> this (.deleteInstance instance-id))))

(defn update-instance
  "Updates an instance, and begins allocating or releasing resources as requested. The returned
   Operation can be used to track the progress of updating the instance. If the named
   instance does not exist, throws SpannerException.

   Immediately upon completion of this request:


     For resource types for which a decrease in the instance's allocation has been requested,
         billing is based on the newly-requested level.


   Until completion of the returned operation:


     Cancelling the operation sets its metadata's
         [cancel_time][UpdateInstanceMetadata.cancel_time], and begins restoring resources to
         their pre-request values. The operation is guaranteed to succeed at undoing all resource
         changes, after which point it terminates with a `CANCELLED` status.
     All other attempts to modify the instance are rejected.
     Reading the instance via the API continues to give the pre-request resource levels.


   Upon completion of the returned operation:


     Billing begins for all successfully-allocated resources (some types may have lower than
         the requested levels).
     All newly-reserved resources are available for serving the instance's tables.
     The instance's new resource levels are readable via the API.


   SNIPPET instance_admin_client_update_instance



   Instance instance = my_instance;
   final String clientProject = my_client_project;
   final String instanceId = my_instance_id;

   final String newDisplayName = my_display_name;

   InstanceInfo toUpdate =
       InstanceInfo.newBuilder(InstanceId.of(clientProject, instanceId))
           .setDisplayName(newDisplayName)
           .setNodeCount(instance.getNodeCount()  1)
           .build();
   // Only update display name
   Operation<Instance, UpdateInstanceMetadata> op =
       instanceAdminClient.updateInstance(toUpdate, InstanceInfo.InstanceField.DISPLAY_NAME);
   op.waitFor().getResult();

   SNIPPET instance_admin_client_update_instance

  instance - `com.google.cloud.spanner.InstanceInfo`
  fields-to-update - `com.google.cloud.spanner.InstanceInfo$InstanceField`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.cloud.spanner.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  (^com.google.api.gax.longrunning.OperationFuture [^InstanceAdminClient this ^com.google.cloud.spanner.InstanceInfo instance ^com.google.cloud.spanner.InstanceInfo$InstanceField fields-to-update]
    (-> this (.updateInstance instance fields-to-update))))

(defn new-instance-builder
  "Returns a builder for Instance object with the given id.

  id - `com.google.cloud.spanner.InstanceId`

  returns: `com.google.cloud.spanner.Instance$Builder`"
  (^com.google.cloud.spanner.Instance$Builder [^InstanceAdminClient this ^com.google.cloud.spanner.InstanceId id]
    (-> this (.newInstanceBuilder id))))

