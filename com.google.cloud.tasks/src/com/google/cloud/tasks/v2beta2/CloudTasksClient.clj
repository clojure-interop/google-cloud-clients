(ns com.google.cloud.tasks.v2beta2.CloudTasksClient
  "Service Description: Cloud Tasks allows developers to manage the execution of background work in
  their applications.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
    QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
    Queue response = cloudTasksClient.getQueue(name);
  }

  Note: close() needs to be called on the cloudTasksClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of CloudTasksSettings to
  create(). For example:

  To customize credentials:



  CloudTasksSettings cloudTasksSettings =
      CloudTasksSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  CloudTasksClient cloudTasksClient =
      CloudTasksClient.create(cloudTasksSettings);

  To customize the endpoint:



  CloudTasksSettings cloudTasksSettings =
      CloudTasksSettings.newBuilder().setEndpoint(myEndpoint).build();
  CloudTasksClient cloudTasksClient =
      CloudTasksClient.create(cloudTasksSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta2 CloudTasksClient]))

(defn *create
  "Constructs an instance of CloudTasksClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.tasks.v2beta2.CloudTasksSettings`

  returns: `com.google.cloud.tasks.v2beta2.CloudTasksClient`

  throws: java.io.IOException"
  (^com.google.cloud.tasks.v2beta2.CloudTasksClient [^com.google.cloud.tasks.v2beta2.CloudTasksSettings settings]
    (CloudTasksClient/create settings))
  (^com.google.cloud.tasks.v2beta2.CloudTasksClient []
    (CloudTasksClient/create )))

(defn acknowledge-task-callable
  "Acknowledges a pull task.

   The worker, that is, the entity that
   [leased][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] this task must call this method to
   indicate that the work associated with the task has finished.

   The worker must acknowledge a task within the
   [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration] or the lease will
   expire and the task will become available to be leased again. After the task is acknowledged,
   it will not be returned by a later
   [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks],
   [GetTask][google.cloud.tasks.v2beta2.CloudTasks.GetTask], or
   [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Timestamp scheduleTime = Timestamp.newBuilder().build();
     AcknowledgeTaskRequest request = AcknowledgeTaskRequest.newBuilder()
       .setName(name.toString())
       .setScheduleTime(scheduleTime)
       .build();
     ApiFuture<Void> future = cloudTasksClient.acknowledgeTaskCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.acknowledgeTaskCallable))))

(defn cancel-lease-callable
  "Cancel a pull task's lease.

   The worker can use this method to cancel a task's lease by setting its
   [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] to now. This will make the task
   available to be leased to the next caller of
   [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Timestamp scheduleTime = Timestamp.newBuilder().build();
     CancelLeaseRequest request = CancelLeaseRequest.newBuilder()
       .setName(name.toString())
       .setScheduleTime(scheduleTime)
       .build();
     ApiFuture<Task> future = cloudTasksClient.cancelLeaseCallable().futureCall(request);
     // Do something
     Task response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.CancelLeaseRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.cancelLeaseCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Returns an
   empty policy if the resource exists and does not have a policy set.

   Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   on the specified resource parent:

   * `cloudtasks.queues.getIamPolicy`

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     ResourceName resource = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .build();
     ApiFuture<Policy> future = cloudTasksClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.getIamPolicyCallable))))

(defn list-tasks-paged-callable
  "Lists the tasks in a queue.

   By default, only the [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC] view is retrieved
   due to performance considerations;
   [response_view][google.cloud.tasks.v2beta2.ListTasksRequest.response_view] controls the subset
   of information which is returned.

   The tasks may be returned in any order. The ordering may change at any time.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     ListTasksRequest request = ListTasksRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListTasksPagedResponse> future = cloudTasksClient.listTasksPagedCallable().futureCall(request);
     // Do something
     for (Task element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.ListTasksRequest,com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.listTasksPagedCallable))))

(defn set-iam-policy
  "Sets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Replaces any
   existing policy.

   Note: The Cloud Console does not check queue-level IAM permissions yet. Project-level
   permissions are required to use the Cloud Console.

   Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   on the specified resource parent:

   * `cloudtasks.queues.setIamPolicy`

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName resource = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = cloudTasksClient.setIamPolicy(resource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `com.google.cloud.tasks.v2beta2.QueueName`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^CloudTasksClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn create-task
  "Creates a task and adds it to a queue.

   Tasks cannot be updated after creation; there is no UpdateTask command.

   * For [App Engine queues][google.cloud.tasks.v2beta2.AppEngineHttpTarget], the maximum
   task size is 100KB. * For [pull queues][google.cloud.tasks.v2beta2.PullTarget], the maximum
   task size is 1MB.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Task task = Task.newBuilder().build();
     Task response = cloudTasksClient.createTask(parent, task);
   }

  parent - Required. The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` The queue must already exist. - `com.google.cloud.tasks.v2beta2.QueueName`
  task - Required. The task to add. Task names have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`. The user can optionally specify a task [name][google.cloud.tasks.v2beta2.Task.name]. If a name is not specified then the system will generate a random unique task id, which will be set in the task returned in the [response][google.cloud.tasks.v2beta2.Task.name]. If [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] is not set or is in the past then Cloud Tasks will set it to the current time. Task De-duplication: Explicitly specifying a task ID enables task de-duplication. If a task's ID is identical to that of an existing task or a task that was deleted or completed recently then the call will fail with [ALREADY_EXISTS][google.rpc.Code.ALREADY_EXISTS]. If the task's queue was created using Cloud Tasks, then another task with the same name can't be created for ~1hour after the original task was deleted or completed. If the task's queue was created using queue.yaml or queue.xml, then another task with the same name can't be created for ~9days after the original task was deleted or completed. Because there is an extra lookup cost to identify duplicate task names, these [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask] calls have significantly increased latency. Using hashed strings for the task id or for the prefix of the task id is recommended. Choosing task ids that are sequential or have sequential prefixes, for example using a timestamp, causes an increase in latency and error rates in all task commands. The infrastructure relies on an approximately uniform distribution of task ids to store and serve tasks efficiently. - `com.google.cloud.tasks.v2beta2.Task`

  returns: `com.google.cloud.tasks.v2beta2.Task`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName parent ^com.google.cloud.tasks.v2beta2.Task task]
    (-> this (.createTask parent task)))
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.CreateTaskRequest request]
    (-> this (.createTask request))))

(defn pause-queue
  "Pauses the queue.

   If a queue is paused then the system will stop dispatching tasks until the queue is resumed
   via [ResumeQueue][google.cloud.tasks.v2beta2.CloudTasks.ResumeQueue]. Tasks can still be added
   when the queue is paused. A queue is paused if its
   [state][google.cloud.tasks.v2beta2.Queue.state] is
   [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Queue response = cloudTasksClient.pauseQueue(name);
   }

  name - Required. The queue name. For example: `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID` - `com.google.cloud.tasks.v2beta2.QueueName`

  returns: `com.google.cloud.tasks.v2beta2.Queue`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName name]
    (-> this (.pauseQueue name))))

(defn list-queues
  "Lists queues.

   Queues are returned in lexicographical order.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (Queue element : cloudTasksClient.listQueues(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID` - `com.google.cloud.tasks.v2beta2.LocationName`

  returns: `com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.LocationName parent]
    (-> this (.listQueues parent))))

(defn get-settings
  "returns: `com.google.cloud.tasks.v2beta2.CloudTasksSettings`"
  (^com.google.cloud.tasks.v2beta2.CloudTasksSettings [^CloudTasksClient this]
    (-> this (.getSettings))))

(defn get-queue-callable
  "Gets a queue.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     GetQueueRequest request = GetQueueRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Queue> future = cloudTasksClient.getQueueCallable().futureCall(request);
     // Do something
     Queue response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.GetQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.getQueueCallable))))

(defn pause-queue-callable
  "Pauses the queue.

   If a queue is paused then the system will stop dispatching tasks until the queue is resumed
   via [ResumeQueue][google.cloud.tasks.v2beta2.CloudTasks.ResumeQueue]. Tasks can still be added
   when the queue is paused. A queue is paused if its
   [state][google.cloud.tasks.v2beta2.Queue.state] is
   [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     PauseQueueRequest request = PauseQueueRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Queue> future = cloudTasksClient.pauseQueueCallable().futureCall(request);
     // Do something
     Queue response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.PauseQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.pauseQueueCallable))))

(defn resume-queue
  "Resume a queue.

   This method resumes a queue after it has been
   [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED] or
   [DISABLED][google.cloud.tasks.v2beta2.Queue.State.DISABLED]. The state of a queue is stored in
   the queue's [state][google.cloud.tasks.v2beta2.Queue.state]; after calling this method it will
   be set to [RUNNING][google.cloud.tasks.v2beta2.Queue.State.RUNNING].

   WARNING: Resuming many high-QPS queues at the same time can lead to target overloading. If
   you are resuming high-QPS queues, follow the 500/50/5 pattern described in [Managing Cloud
   Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Queue response = cloudTasksClient.resumeQueue(name);
   }

  name - Required. The queue name. For example: `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID` - `com.google.cloud.tasks.v2beta2.QueueName`

  returns: `com.google.cloud.tasks.v2beta2.Queue`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName name]
    (-> this (.resumeQueue name))))

(defn renew-lease-callable
  "Renew the current lease of a pull task.

   The worker can use this method to extend the lease by a new duration, starting from now. The
   new task lease will be returned in the task's
   [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Timestamp scheduleTime = Timestamp.newBuilder().build();
     Duration leaseDuration = Duration.newBuilder().build();
     RenewLeaseRequest request = RenewLeaseRequest.newBuilder()
       .setName(name.toString())
       .setScheduleTime(scheduleTime)
       .setLeaseDuration(leaseDuration)
       .build();
     ApiFuture<Task> future = cloudTasksClient.renewLeaseCallable().futureCall(request);
     // Do something
     Task response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.RenewLeaseRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.renewLeaseCallable))))

(defn resume-queue-callable
  "Resume a queue.

   This method resumes a queue after it has been
   [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED] or
   [DISABLED][google.cloud.tasks.v2beta2.Queue.State.DISABLED]. The state of a queue is stored in
   the queue's [state][google.cloud.tasks.v2beta2.Queue.state]; after calling this method it will
   be set to [RUNNING][google.cloud.tasks.v2beta2.Queue.State.RUNNING].

   WARNING: Resuming many high-QPS queues at the same time can lead to target overloading. If
   you are resuming high-QPS queues, follow the 500/50/5 pattern described in [Managing Cloud
   Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     ResumeQueueRequest request = ResumeQueueRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Queue> future = cloudTasksClient.resumeQueueCallable().futureCall(request);
     // Do something
     Queue response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.ResumeQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.resumeQueueCallable))))

(defn update-queue-callable
  "Updates a queue.

   This method creates the queue if it does not exist and updates the queue if it does exist.

   Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   is 31 days old, the task will be deleted regardless of whether it was dispatched or not.

   WARNING: Using this method may have unintended side effects if you are using an App Engine
   `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     Queue queue = Queue.newBuilder().build();
     UpdateQueueRequest request = UpdateQueueRequest.newBuilder()
       .setQueue(queue)
       .build();
     ApiFuture<Queue> future = cloudTasksClient.updateQueueCallable().futureCall(request);
     // Do something
     Queue response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.UpdateQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.updateQueueCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.tasks.v2beta2.stub.CloudTasksStub`"
  ([^CloudTasksClient this]
    (-> this (.getStub))))

(defn delete-queue-callable
  "Deletes a queue.

   This command will delete the queue even if it has tasks in it.

   Note: If you delete a queue, a queue with the same name can't be created for 7 days.

   WARNING: Using this method may have unintended side effects if you are using an App Engine
   `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     DeleteQueueRequest request = DeleteQueueRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = cloudTasksClient.deleteQueueCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.DeleteQueueRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.deleteQueueCallable))))

(defn update-queue
  "Updates a queue.

   This method creates the queue if it does not exist and updates the queue if it does exist.

   Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   is 31 days old, the task will be deleted regardless of whether it was dispatched or not.

   WARNING: Using this method may have unintended side effects if you are using an App Engine
   `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     Queue queue = Queue.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Queue response = cloudTasksClient.updateQueue(queue, updateMask);
   }

  queue - Required. The queue to create or update. The queue's [name][google.cloud.tasks.v2beta2.Queue.name] must be specified. Output only fields cannot be modified using UpdateQueue. Any value specified for an output only field will be ignored. The queue's [name][google.cloud.tasks.v2beta2.Queue.name] cannot be changed. - `com.google.cloud.tasks.v2beta2.Queue`
  update-mask - A mask used to specify which fields of the queue are being updated. If empty, then all fields will be updated. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.tasks.v2beta2.Queue`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.Queue queue ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateQueue queue update-mask)))
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.UpdateQueueRequest request]
    (-> this (.updateQueue request))))

(defn list-queues-callable
  "Lists queues.

   Queues are returned in lexicographical order.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListQueuesRequest request = ListQueuesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListQueuesResponse response = cloudTasksClient.listQueuesCallable().call(request);
       for (Queue element : response.getQueuesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.ListQueuesRequest,com.google.cloud.tasks.v2beta2.ListQueuesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.listQueuesCallable))))

(defn list-tasks-callable
  "Lists the tasks in a queue.

   By default, only the [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC] view is retrieved
   due to performance considerations;
   [response_view][google.cloud.tasks.v2beta2.ListTasksRequest.response_view] controls the subset
   of information which is returned.

   The tasks may be returned in any order. The ordering may change at any time.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     ListTasksRequest request = ListTasksRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListTasksResponse response = cloudTasksClient.listTasksCallable().call(request);
       for (Task element : response.getTasksList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.ListTasksRequest,com.google.cloud.tasks.v2beta2.ListTasksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.listTasksCallable))))

(defn cancel-lease
  "Cancel a pull task's lease.

   The worker can use this method to cancel a task's lease by setting its
   [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] to now. This will make the task
   available to be leased to the next caller of
   [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Timestamp scheduleTime = Timestamp.newBuilder().build();
     Task response = cloudTasksClient.cancelLease(name, scheduleTime);
   }

  name - Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` - `com.google.cloud.tasks.v2beta2.TaskName`
  schedule-time - Required. The task's current schedule time, available in the [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response. This restriction is to ensure that your worker currently holds the lease. - `com.google.protobuf.Timestamp`

  returns: `com.google.cloud.tasks.v2beta2.Task`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.TaskName name ^com.google.protobuf.Timestamp schedule-time]
    (-> this (.cancelLease name schedule-time)))
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.CancelLeaseRequest request]
    (-> this (.cancelLease request))))

(defn run-task
  "Forces a task to run now.

   When this method is called, Cloud Tasks will dispatch the task, even if the task is already
   running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta2.RateLimits] or is
   [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].

   This command is meant to be used for manual debugging. For example,
   [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] can be used to retry a failed task
   after a fix has been made or to manually force a task to be dispatched now.

   The dispatched task is returned. That is, the task that is returned contains the
   [status][google.cloud.tasks.v2beta2.Task.status] after the task is dispatched but before the
   task is received by its target.

   If Cloud Tasks receives a successful response from the task's target, then the task will be
   deleted; otherwise the task's [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time]
   will be reset to the time that [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] was
   called plus the retry delay specified in the queue's
   [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig].

   [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] returns
   [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a task that has already succeeded
   or permanently failed.

   [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] cannot be called on a [pull
   task][google.cloud.tasks.v2beta2.PullMessage].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Task response = cloudTasksClient.runTask(name);
   }

  name - Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` - `com.google.cloud.tasks.v2beta2.TaskName`

  returns: `com.google.cloud.tasks.v2beta2.Task`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.TaskName name]
    (-> this (.runTask name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^CloudTasksClient this]
    (-> this (.isShutdown))))

(defn create-queue-callable
  "Creates a queue.

   Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   is 31 days old, the task will be deleted regardless of whether it was dispatched or not.

   WARNING: Using this method may have unintended side effects if you are using an App Engine
   `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Queue queue = Queue.newBuilder().build();
     CreateQueueRequest request = CreateQueueRequest.newBuilder()
       .setParent(parent.toString())
       .setQueue(queue)
       .build();
     ApiFuture<Queue> future = cloudTasksClient.createQueueCallable().futureCall(request);
     // Do something
     Queue response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.CreateQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.createQueueCallable))))

(defn create-queue
  "Creates a queue.

   Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   is 31 days old, the task will be deleted regardless of whether it was dispatched or not.

   WARNING: Using this method may have unintended side effects if you are using an App Engine
   `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Queue queue = Queue.newBuilder().build();
     Queue response = cloudTasksClient.createQueue(parent, queue);
   }

  parent - Required. The location name in which the queue will be created. For example: `projects/PROJECT_ID/locations/LOCATION_ID` The list of allowed locations can be obtained by calling Cloud Tasks' implementation of [ListLocations][google.cloud.location.Locations.ListLocations]. - `com.google.cloud.tasks.v2beta2.LocationName`
  queue - Required. The queue to create. [Queue's name][google.cloud.tasks.v2beta2.Queue.name] cannot be the same as an existing queue. - `com.google.cloud.tasks.v2beta2.Queue`

  returns: `com.google.cloud.tasks.v2beta2.Queue`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.LocationName parent ^com.google.cloud.tasks.v2beta2.Queue queue]
    (-> this (.createQueue parent queue)))
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.CreateQueueRequest request]
    (-> this (.createQueue request))))

(defn acknowledge-task
  "Acknowledges a pull task.

   The worker, that is, the entity that
   [leased][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] this task must call this method to
   indicate that the work associated with the task has finished.

   The worker must acknowledge a task within the
   [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration] or the lease will
   expire and the task will become available to be leased again. After the task is acknowledged,
   it will not be returned by a later
   [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks],
   [GetTask][google.cloud.tasks.v2beta2.CloudTasks.GetTask], or
   [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Timestamp scheduleTime = Timestamp.newBuilder().build();
     cloudTasksClient.acknowledgeTask(name, scheduleTime);
   }

  name - Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` - `com.google.cloud.tasks.v2beta2.TaskName`
  schedule-time - Required. The task's current schedule time, available in the [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response. This restriction is to ensure that your worker currently holds the lease. - `com.google.protobuf.Timestamp`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.TaskName name ^com.google.protobuf.Timestamp schedule-time]
    (-> this (.acknowledgeTask name schedule-time)))
  ([^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest request]
    (-> this (.acknowledgeTask request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^CloudTasksClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn purge-queue
  "Purges a queue by deleting all of its tasks.

   All tasks created before this method is called are permanently deleted.

   Purge operations can take up to one minute to take effect. Tasks might be dispatched before
   the purge takes effect. A purge is irreversible.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Queue response = cloudTasksClient.purgeQueue(name);
   }

  name - Required. The queue name. For example: `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID` - `com.google.cloud.tasks.v2beta2.QueueName`

  returns: `com.google.cloud.tasks.v2beta2.Queue`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName name]
    (-> this (.purgeQueue name))))

(defn shutdown
  ""
  ([^CloudTasksClient this]
    (-> this (.shutdown))))

(defn delete-queue
  "Deletes a queue.

   This command will delete the queue even if it has tasks in it.

   Note: If you delete a queue, a queue with the same name can't be created for 7 days.

   WARNING: Using this method may have unintended side effects if you are using an App Engine
   `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     cloudTasksClient.deleteQueue(name);
   }

  name - Required. The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` - `com.google.cloud.tasks.v2beta2.QueueName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName name]
    (-> this (.deleteQueue name))))

(defn list-queues-paged-callable
  "Lists queues.

   Queues are returned in lexicographical order.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListQueuesRequest request = ListQueuesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListQueuesPagedResponse> future = cloudTasksClient.listQueuesPagedCallable().futureCall(request);
     // Do something
     for (Queue element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.ListQueuesRequest,com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.listQueuesPagedCallable))))

(defn renew-lease
  "Renew the current lease of a pull task.

   The worker can use this method to extend the lease by a new duration, starting from now. The
   new task lease will be returned in the task's
   [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Timestamp scheduleTime = Timestamp.newBuilder().build();
     Duration leaseDuration = Duration.newBuilder().build();
     Task response = cloudTasksClient.renewLease(name, scheduleTime, leaseDuration);
   }

  name - Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` - `com.google.cloud.tasks.v2beta2.TaskName`
  schedule-time - Required. The task's current schedule time, available in the [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response. This restriction is to ensure that your worker currently holds the lease. - `com.google.protobuf.Timestamp`
  lease-duration - Required. The desired new lease duration, starting from now. The maximum lease duration is 1 week. `lease_duration` will be truncated to the nearest second. - `com.google.protobuf.Duration`

  returns: `com.google.cloud.tasks.v2beta2.Task`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.TaskName name ^com.google.protobuf.Timestamp schedule-time ^com.google.protobuf.Duration lease-duration]
    (-> this (.renewLease name schedule-time lease-duration)))
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.RenewLeaseRequest request]
    (-> this (.renewLease request))))

(defn delete-task
  "Deletes a task.

   A task can be deleted if it is scheduled or dispatched. A task cannot be deleted if it has
   completed successfully or permanently failed.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     cloudTasksClient.deleteTask(name);
   }

  name - Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` - `com.google.cloud.tasks.v2beta2.TaskName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.TaskName name]
    (-> this (.deleteTask name))))

(defn lease-tasks
  "Leases tasks from a pull queue for
   [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].

   This method is invoked by the worker to obtain a lease. The worker must acknowledge the task
   via [AcknowledgeTask][google.cloud.tasks.v2beta2.CloudTasks.AcknowledgeTask] after they have
   performed the work associated with the task.

   The [payload][google.cloud.tasks.v2beta2.PullMessage.payload] is intended to store data that
   the worker needs to perform the work associated with the task. To return the payloads in the
   [response][google.cloud.tasks.v2beta2.LeaseTasksResponse], set
   [response_view][google.cloud.tasks.v2beta2.LeaseTasksRequest.response_view] to
   [FULL][google.cloud.tasks.v2beta2.Task.View.FULL].

   A maximum of 10 qps of [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks]
   requests are allowed per queue. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] is
   returned when this limit is exceeded. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
   is also returned when
   [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second]
   is exceeded.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Duration leaseDuration = Duration.newBuilder().build();
     LeaseTasksRequest request = LeaseTasksRequest.newBuilder()
       .setParent(parent.toString())
       .setLeaseDuration(leaseDuration)
       .build();
     LeaseTasksResponse response = cloudTasksClient.leaseTasks(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.tasks.v2beta2.LeaseTasksRequest`

  returns: `com.google.cloud.tasks.v2beta2.LeaseTasksResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.LeaseTasksResponse [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.LeaseTasksRequest request]
    (-> this (.leaseTasks request))))

(defn set-iam-policy-callable
  "Sets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Replaces any
   existing policy.

   Note: The Cloud Console does not check queue-level IAM permissions yet. Project-level
   permissions are required to use the Cloud Console.

   Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   on the specified resource parent:

   * `cloudtasks.queues.setIamPolicy`

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     ResourceName resource = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = cloudTasksClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^CloudTasksClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta2.Queue]. If the
   resource does not exist, this will return an empty set of permissions, not a
   [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     ResourceName resource = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(resource.toString())
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = cloudTasksClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Returns an
   empty policy if the resource exists and does not have a policy set.

   Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   on the specified resource parent:

   * `cloudtasks.queues.getIamPolicy`

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName resource = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Policy response = cloudTasksClient.getIamPolicy(resource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.tasks.v2beta2.QueueName`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName resource]
    (-> this (.getIamPolicy resource))))

(defn get-task-callable
  "Gets a task.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     GetTaskRequest request = GetTaskRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Task> future = cloudTasksClient.getTaskCallable().futureCall(request);
     // Do something
     Task response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.GetTaskRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.getTaskCallable))))

(defn delete-task-callable
  "Deletes a task.

   A task can be deleted if it is scheduled or dispatched. A task cannot be deleted if it has
   completed successfully or permanently failed.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     DeleteTaskRequest request = DeleteTaskRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = cloudTasksClient.deleteTaskCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.DeleteTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.deleteTaskCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^CloudTasksClient this]
    (-> this (.isTerminated))))

(defn get-queue
  "Gets a queue.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Queue response = cloudTasksClient.getQueue(name);
   }

  name - Required. The resource name of the queue. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` - `com.google.cloud.tasks.v2beta2.QueueName`

  returns: `com.google.cloud.tasks.v2beta2.Queue`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Queue [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName name]
    (-> this (.getQueue name))))

(defn get-task
  "Gets a task.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     Task response = cloudTasksClient.getTask(name);
   }

  name - Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` - `com.google.cloud.tasks.v2beta2.TaskName`

  returns: `com.google.cloud.tasks.v2beta2.Task`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.Task [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.TaskName name]
    (-> this (.getTask name))))

(defn list-tasks
  "Lists the tasks in a queue.

   By default, only the [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC] view is retrieved
   due to performance considerations;
   [response_view][google.cloud.tasks.v2beta2.ListTasksRequest.response_view] controls the subset
   of information which is returned.

   The tasks may be returned in any order. The ordering may change at any time.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     for (Task element : cloudTasksClient.listTasks(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` - `com.google.cloud.tasks.v2beta2.QueueName`

  returns: `com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName parent]
    (-> this (.listTasks parent))))

(defn create-task-callable
  "Creates a task and adds it to a queue.

   Tasks cannot be updated after creation; there is no UpdateTask command.

   * For [App Engine queues][google.cloud.tasks.v2beta2.AppEngineHttpTarget], the maximum
   task size is 100KB. * For [pull queues][google.cloud.tasks.v2beta2.PullTarget], the maximum
   task size is 1MB.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Task task = Task.newBuilder().build();
     CreateTaskRequest request = CreateTaskRequest.newBuilder()
       .setParent(parent.toString())
       .setTask(task)
       .build();
     ApiFuture<Task> future = cloudTasksClient.createTaskCallable().futureCall(request);
     // Do something
     Task response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.CreateTaskRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.createTaskCallable))))

(defn lease-tasks-callable
  "Leases tasks from a pull queue for
   [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].

   This method is invoked by the worker to obtain a lease. The worker must acknowledge the task
   via [AcknowledgeTask][google.cloud.tasks.v2beta2.CloudTasks.AcknowledgeTask] after they have
   performed the work associated with the task.

   The [payload][google.cloud.tasks.v2beta2.PullMessage.payload] is intended to store data that
   the worker needs to perform the work associated with the task. To return the payloads in the
   [response][google.cloud.tasks.v2beta2.LeaseTasksResponse], set
   [response_view][google.cloud.tasks.v2beta2.LeaseTasksRequest.response_view] to
   [FULL][google.cloud.tasks.v2beta2.Task.View.FULL].

   A maximum of 10 qps of [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks]
   requests are allowed per queue. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] is
   returned when this limit is exceeded. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
   is also returned when
   [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second]
   is exceeded.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName parent = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     Duration leaseDuration = Duration.newBuilder().build();
     LeaseTasksRequest request = LeaseTasksRequest.newBuilder()
       .setParent(parent.toString())
       .setLeaseDuration(leaseDuration)
       .build();
     ApiFuture<LeaseTasksResponse> future = cloudTasksClient.leaseTasksCallable().futureCall(request);
     // Do something
     LeaseTasksResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.LeaseTasksRequest,com.google.cloud.tasks.v2beta2.LeaseTasksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.leaseTasksCallable))))

(defn shutdown-now
  ""
  ([^CloudTasksClient this]
    (-> this (.shutdownNow))))

(defn purge-queue-callable
  "Purges a queue by deleting all of its tasks.

   All tasks created before this method is called are permanently deleted.

   Purge operations can take up to one minute to take effect. Tasks might be dispatched before
   the purge takes effect. A purge is irreversible.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName name = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     PurgeQueueRequest request = PurgeQueueRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Queue> future = cloudTasksClient.purgeQueueCallable().futureCall(request);
     // Do something
     Queue response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.PurgeQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.purgeQueueCallable))))

(defn test-iam-permissions
  "Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta2.Queue]. If the
   resource does not exist, this will return an empty set of permissions, not a
   [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     QueueName resource = QueueName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = cloudTasksClient.testIamPermissions(resource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.tasks.v2beta2.QueueName`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^CloudTasksClient this ^com.google.cloud.tasks.v2beta2.QueueName resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^CloudTasksClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

(defn run-task-callable
  "Forces a task to run now.

   When this method is called, Cloud Tasks will dispatch the task, even if the task is already
   running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta2.RateLimits] or is
   [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].

   This command is meant to be used for manual debugging. For example,
   [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] can be used to retry a failed task
   after a fix has been made or to manually force a task to be dispatched now.

   The dispatched task is returned. That is, the task that is returned contains the
   [status][google.cloud.tasks.v2beta2.Task.status] after the task is dispatched but before the
   task is received by its target.

   If Cloud Tasks receives a successful response from the task's target, then the task will be
   deleted; otherwise the task's [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time]
   will be reset to the time that [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] was
   called plus the retry delay specified in the queue's
   [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig].

   [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] returns
   [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a task that has already succeeded
   or permanently failed.

   [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] cannot be called on a [pull
   task][google.cloud.tasks.v2beta2.PullMessage].

   Sample code:



   try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
     TaskName name = TaskName.of(\"[PROJECT]\", \"[LOCATION]\", \"[QUEUE]\", \"[TASK]\");
     RunTaskRequest request = RunTaskRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Task> future = cloudTasksClient.runTaskCallable().futureCall(request);
     // Do something
     Task response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta2.RunTaskRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksClient this]
    (-> this (.runTaskCallable))))

