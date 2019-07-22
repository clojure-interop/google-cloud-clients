(ns com.google.cloud.scheduler.v1beta1.CloudSchedulerClient
  "Service Description: The Cloud Scheduler API allows external entities to reliably schedule
  asynchronous jobs.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
    JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
    Job response = cloudSchedulerClient.getJob(name);
  }

  Note: close() needs to be called on the cloudSchedulerClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of CloudSchedulerSettings to
  create(). For example:

  To customize credentials:



  CloudSchedulerSettings cloudSchedulerSettings =
      CloudSchedulerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  CloudSchedulerClient cloudSchedulerClient =
      CloudSchedulerClient.create(cloudSchedulerSettings);

  To customize the endpoint:



  CloudSchedulerSettings cloudSchedulerSettings =
      CloudSchedulerSettings.newBuilder().setEndpoint(myEndpoint).build();
  CloudSchedulerClient cloudSchedulerClient =
      CloudSchedulerClient.create(cloudSchedulerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1beta1 CloudSchedulerClient]))

(defn *create
  "Constructs an instance of CloudSchedulerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.scheduler.v1beta1.CloudSchedulerSettings`

  returns: `com.google.cloud.scheduler.v1beta1.CloudSchedulerClient`

  throws: java.io.IOException"
  (^com.google.cloud.scheduler.v1beta1.CloudSchedulerClient [^com.google.cloud.scheduler.v1beta1.CloudSchedulerSettings settings]
    (CloudSchedulerClient/create settings))
  (^com.google.cloud.scheduler.v1beta1.CloudSchedulerClient []
    (CloudSchedulerClient/create )))

(defn get-job
  "Gets a job.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     Job response = cloudSchedulerClient.getJob(name);
   }

  name - Required. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. - `com.google.cloud.scheduler.v1beta1.JobName`

  returns: `com.google.cloud.scheduler.v1beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.JobName name]
    (-> this (.getJob name))))

(defn update-job-callable
  "Updates a job.

   If successful, the updated [Job][google.cloud.scheduler.v1beta1.Job] is returned. If the job
   does not exist, `NOT_FOUND` is returned.

   If UpdateJob does not successfully return, it is possible for the job to be in an
   [Job.State.UPDATE_FAILED][google.cloud.scheduler.v1beta1.Job.State.UPDATE_FAILED] state. A job
   in this state may not be executed. If this happens, retry the UpdateJob request until a
   successful response is received.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     Job job = Job.newBuilder().build();
     UpdateJobRequest request = UpdateJobRequest.newBuilder()
       .setJob(job)
       .build();
     ApiFuture<Job> future = cloudSchedulerClient.updateJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.UpdateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.updateJobCallable))))

(defn pause-job
  "Pauses a job.

   If a job is paused then the system will stop executing the job until it is re-enabled via
   [ResumeJob][google.cloud.scheduler.v1beta1.CloudScheduler.ResumeJob]. The state of the job is
   stored in [state][google.cloud.scheduler.v1beta1.Job.state]; if paused it will be set to
   [Job.State.PAUSED][google.cloud.scheduler.v1beta1.Job.State.PAUSED]. A job must be in
   [Job.State.ENABLED][google.cloud.scheduler.v1beta1.Job.State.ENABLED] to be paused.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     Job response = cloudSchedulerClient.pauseJob(name);
   }

  name - Required. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. - `com.google.cloud.scheduler.v1beta1.JobName`

  returns: `com.google.cloud.scheduler.v1beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.JobName name]
    (-> this (.pauseJob name))))

(defn get-settings
  "returns: `com.google.cloud.scheduler.v1beta1.CloudSchedulerSettings`"
  (^com.google.cloud.scheduler.v1beta1.CloudSchedulerSettings [^CloudSchedulerClient this]
    (-> this (.getSettings))))

(defn run-job-callable
  "Forces a job to run now.

   When this method is called, Cloud Scheduler will dispatch the job, even if the job is
   already running.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     RunJobRequest request = RunJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Job> future = cloudSchedulerClient.runJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.RunJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.runJobCallable))))

(defn list-jobs-paged-callable
  "Lists jobs.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListJobsRequest request = ListJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListJobsPagedResponse> future = cloudSchedulerClient.listJobsPagedCallable().futureCall(request);
     // Do something
     for (Job element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.ListJobsRequest,com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "Lists jobs.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListJobsRequest request = ListJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListJobsResponse response = cloudSchedulerClient.listJobsCallable().call(request);
       for (Job element : response.getJobsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.ListJobsRequest,com.google.cloud.scheduler.v1beta1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.listJobsCallable))))

(defn update-job
  "Updates a job.

   If successful, the updated [Job][google.cloud.scheduler.v1beta1.Job] is returned. If the job
   does not exist, `NOT_FOUND` is returned.

   If UpdateJob does not successfully return, it is possible for the job to be in an
   [Job.State.UPDATE_FAILED][google.cloud.scheduler.v1beta1.Job.State.UPDATE_FAILED] state. A job
   in this state may not be executed. If this happens, retry the UpdateJob request until a
   successful response is received.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     Job job = Job.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Job response = cloudSchedulerClient.updateJob(job, updateMask);
   }

  job - Required. The new job properties. [name][google.cloud.scheduler.v1beta1.Job.name] must be specified. Output only fields cannot be modified using UpdateJob. Any value specified for an output only field will be ignored. - `com.google.cloud.scheduler.v1beta1.Job`
  update-mask - A mask used to specify which fields of the job are being updated. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.scheduler.v1beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.Job job ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateJob job update-mask)))
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStub`"
  ([^CloudSchedulerClient this]
    (-> this (.getStub))))

(defn delete-job
  "Deletes a job.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     cloudSchedulerClient.deleteJob(name);
   }

  name - Required. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. - `com.google.cloud.scheduler.v1beta1.JobName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.JobName name]
    (-> this (.deleteJob name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^CloudSchedulerClient this]
    (-> this (.isShutdown))))

(defn delete-job-callable
  "Deletes a job.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     DeleteJobRequest request = DeleteJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = cloudSchedulerClient.deleteJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.deleteJobCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^CloudSchedulerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn resume-job-callable
  "Resume a job.

   This method reenables a job after it has been
   [Job.State.PAUSED][google.cloud.scheduler.v1beta1.Job.State.PAUSED]. The state of a job is
   stored in [Job.state][google.cloud.scheduler.v1beta1.Job.state]; after calling this method it
   will be set to [Job.State.ENABLED][google.cloud.scheduler.v1beta1.Job.State.ENABLED]. A job
   must be in [Job.State.PAUSED][google.cloud.scheduler.v1beta1.Job.State.PAUSED] to be resumed.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     ResumeJobRequest request = ResumeJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Job> future = cloudSchedulerClient.resumeJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.ResumeJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.resumeJobCallable))))

(defn shutdown
  ""
  ([^CloudSchedulerClient this]
    (-> this (.shutdown))))

(defn list-jobs
  "Lists jobs.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (Job element : cloudSchedulerClient.listJobs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`. - `com.google.cloud.scheduler.v1beta1.LocationName`

  returns: `com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.LocationName parent]
    (-> this (.listJobs parent))))

(defn close
  ""
  ([^CloudSchedulerClient this]
    (-> this (.close))))

(defn pause-job-callable
  "Pauses a job.

   If a job is paused then the system will stop executing the job until it is re-enabled via
   [ResumeJob][google.cloud.scheduler.v1beta1.CloudScheduler.ResumeJob]. The state of the job is
   stored in [state][google.cloud.scheduler.v1beta1.Job.state]; if paused it will be set to
   [Job.State.PAUSED][google.cloud.scheduler.v1beta1.Job.State.PAUSED]. A job must be in
   [Job.State.ENABLED][google.cloud.scheduler.v1beta1.Job.State.ENABLED] to be paused.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     PauseJobRequest request = PauseJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Job> future = cloudSchedulerClient.pauseJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.PauseJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.pauseJobCallable))))

(defn get-job-callable
  "Gets a job.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     GetJobRequest request = GetJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Job> future = cloudSchedulerClient.getJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.GetJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.getJobCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^CloudSchedulerClient this]
    (-> this (.isTerminated))))

(defn run-job
  "Forces a job to run now.

   When this method is called, Cloud Scheduler will dispatch the job, even if the job is
   already running.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     Job response = cloudSchedulerClient.runJob(name);
   }

  name - Required. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. - `com.google.cloud.scheduler.v1beta1.JobName`

  returns: `com.google.cloud.scheduler.v1beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.JobName name]
    (-> this (.runJob name))))

(defn create-job-callable
  "Creates a job.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Job job = Job.newBuilder().build();
     CreateJobRequest request = CreateJobRequest.newBuilder()
       .setParent(parent.toString())
       .setJob(job)
       .build();
     ApiFuture<Job> future = cloudSchedulerClient.createJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.CreateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerClient this]
    (-> this (.createJobCallable))))

(defn create-job
  "Creates a job.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Job job = Job.newBuilder().build();
     Job response = cloudSchedulerClient.createJob(parent, job);
   }

  parent - Required. The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`. - `com.google.cloud.scheduler.v1beta1.LocationName`
  job - Required. The job to add. The user can optionally specify a name for the job in [name][google.cloud.scheduler.v1beta1.Job.name]. [name][google.cloud.scheduler.v1beta1.Job.name] cannot be the same as an existing job. If a name is not specified then the system will generate a random unique name that will be returned ([name][google.cloud.scheduler.v1beta1.Job.name]) in the response. - `com.google.cloud.scheduler.v1beta1.Job`

  returns: `com.google.cloud.scheduler.v1beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.LocationName parent ^com.google.cloud.scheduler.v1beta1.Job job]
    (-> this (.createJob parent job)))
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.CreateJobRequest request]
    (-> this (.createJob request))))

(defn resume-job
  "Resume a job.

   This method reenables a job after it has been
   [Job.State.PAUSED][google.cloud.scheduler.v1beta1.Job.State.PAUSED]. The state of a job is
   stored in [Job.state][google.cloud.scheduler.v1beta1.Job.state]; after calling this method it
   will be set to [Job.State.ENABLED][google.cloud.scheduler.v1beta1.Job.State.ENABLED]. A job
   must be in [Job.State.PAUSED][google.cloud.scheduler.v1beta1.Job.State.PAUSED] to be resumed.

   Sample code:



   try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
     JobName name = JobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[JOB]\");
     Job response = cloudSchedulerClient.resumeJob(name);
   }

  name - Required. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. - `com.google.cloud.scheduler.v1beta1.JobName`

  returns: `com.google.cloud.scheduler.v1beta1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.scheduler.v1beta1.Job [^CloudSchedulerClient this ^com.google.cloud.scheduler.v1beta1.JobName name]
    (-> this (.resumeJob name))))

(defn shutdown-now
  ""
  ([^CloudSchedulerClient this]
    (-> this (.shutdownNow))))

