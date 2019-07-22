(ns com.google.cloud.dataproc.v1.JobControllerClient
  "Service Description: The JobController provides methods to manage jobs.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
    String projectId = \"\";
    String region = \"\";
    Job job = Job.newBuilder().build();
    Job response = jobControllerClient.submitJob(projectId, region, job);
  }

  Note: close() needs to be called on the jobControllerClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of JobControllerSettings to
  create(). For example:

  To customize credentials:



  JobControllerSettings jobControllerSettings =
      JobControllerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  JobControllerClient jobControllerClient =
      JobControllerClient.create(jobControllerSettings);

  To customize the endpoint:



  JobControllerSettings jobControllerSettings =
      JobControllerSettings.newBuilder().setEndpoint(myEndpoint).build();
  JobControllerClient jobControllerClient =
      JobControllerClient.create(jobControllerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 JobControllerClient]))

(defn *create
  "Constructs an instance of JobControllerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dataproc.v1.JobControllerSettings`

  returns: `com.google.cloud.dataproc.v1.JobControllerClient`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.JobControllerClient [^com.google.cloud.dataproc.v1.JobControllerSettings settings]
    (JobControllerClient/create settings))
  (^com.google.cloud.dataproc.v1.JobControllerClient []
    (JobControllerClient/create )))

(defn get-job
  "Gets the resource representation for a job in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     Job response = jobControllerClient.getJob(projectId, region, jobId);
   }

  project-id - Required. The ID of the Google Cloud Platform project that the job belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  job-id - Required. The job ID. - `java.lang.String`

  returns: `com.google.cloud.dataproc.v1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String job-id]
    (-> this (.getJob project-id region job-id)))
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^com.google.cloud.dataproc.v1.GetJobRequest request]
    (-> this (.getJob request))))

(defn update-job-callable
  "Updates a job in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     Job job = Job.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateJobRequest request = UpdateJobRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setJobId(jobId)
       .setJob(job)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Job> future = jobControllerClient.updateJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.UpdateJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.updateJobCallable))))

(defn get-settings
  "returns: `com.google.cloud.dataproc.v1.JobControllerSettings`"
  (^com.google.cloud.dataproc.v1.JobControllerSettings [^JobControllerClient this]
    (-> this (.getSettings))))

(defn list-jobs-paged-callable
  "Lists regions/{region}/jobs in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     ListJobsRequest request = ListJobsRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .build();
     ApiFuture<ListJobsPagedResponse> future = jobControllerClient.listJobsPagedCallable().futureCall(request);
     // Do something
     for (Job element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.ListJobsRequest,com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.listJobsPagedCallable))))

(defn submit-job
  "Submits a job to a cluster.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     Job job = Job.newBuilder().build();
     Job response = jobControllerClient.submitJob(projectId, region, job);
   }

  project-id - Required. The ID of the Google Cloud Platform project that the job belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  job - Required. The job resource. - `com.google.cloud.dataproc.v1.Job`

  returns: `com.google.cloud.dataproc.v1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^java.lang.String project-id ^java.lang.String region ^com.google.cloud.dataproc.v1.Job job]
    (-> this (.submitJob project-id region job)))
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^com.google.cloud.dataproc.v1.SubmitJobRequest request]
    (-> this (.submitJob request))))

(defn list-jobs-callable
  "Lists regions/{region}/jobs in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     ListJobsRequest request = ListJobsRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .build();
     while (true) {
       ListJobsResponse response = jobControllerClient.listJobsCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.ListJobsRequest,com.google.cloud.dataproc.v1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.listJobsCallable))))

(defn update-job
  "Updates a job in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     Job job = Job.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateJobRequest request = UpdateJobRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setJobId(jobId)
       .setJob(job)
       .setUpdateMask(updateMask)
       .build();
     Job response = jobControllerClient.updateJob(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.dataproc.v1.UpdateJobRequest`

  returns: `com.google.cloud.dataproc.v1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^com.google.cloud.dataproc.v1.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dataproc.v1.stub.JobControllerStub`"
  ([^JobControllerClient this]
    (-> this (.getStub))))

(defn delete-job
  "Deletes the job from the project. If the job is active, the delete fails, and the response
   returns `FAILED_PRECONDITION`.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     jobControllerClient.deleteJob(projectId, region, jobId);
   }

  project-id - Required. The ID of the Google Cloud Platform project that the job belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  job-id - Required. The job ID. - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^JobControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String job-id]
    (-> this (.deleteJob project-id region job-id)))
  ([^JobControllerClient this ^com.google.cloud.dataproc.v1.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^JobControllerClient this]
    (-> this (.isShutdown))))

(defn delete-job-callable
  "Deletes the job from the project. If the job is active, the delete fails, and the response
   returns `FAILED_PRECONDITION`.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     DeleteJobRequest request = DeleteJobRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setJobId(jobId)
       .build();
     ApiFuture<Void> future = jobControllerClient.deleteJobCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.deleteJobCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^JobControllerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^JobControllerClient this]
    (-> this (.shutdown))))

(defn cancel-job
  "Starts a job cancellation request. To access the job resource after cancellation, call
   [regions/{region}/jobs.list](/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or
   [regions/{region}/jobs.get](/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     Job response = jobControllerClient.cancelJob(projectId, region, jobId);
   }

  project-id - Required. The ID of the Google Cloud Platform project that the job belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  job-id - Required. The job ID. - `java.lang.String`

  returns: `com.google.cloud.dataproc.v1.Job`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String job-id]
    (-> this (.cancelJob project-id region job-id)))
  (^com.google.cloud.dataproc.v1.Job [^JobControllerClient this ^com.google.cloud.dataproc.v1.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn list-jobs
  "Lists regions/{region}/jobs in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String filter = \"\";
     for (Job element : jobControllerClient.listJobs(projectId, region, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project-id - Required. The ID of the Google Cloud Platform project that the job belongs to. - `java.lang.String`
  region - Required. The Cloud Dataproc region in which to handle the request. - `java.lang.String`
  filter - Optional. A filter constraining the jobs to list. Filters are case-sensitive and have the following syntax: [field = value] AND [field [= value]] ... where **field** is `status.state` or `labels.[KEY]`, and `[KEY]` is a label key. **value** can be `*` to match all values. `status.state` can be either `ACTIVE` or `NON_ACTIVE`. Only the logical `AND` operator is supported; space-separated items are treated as having an implicit `AND` operator. Example filter: status.state = ACTIVE AND labels.env = staging AND labels.starred = * - `java.lang.String`

  returns: `com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse [^JobControllerClient this ^java.lang.String project-id ^java.lang.String region ^java.lang.String filter]
    (-> this (.listJobs project-id region filter)))
  (^com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse [^JobControllerClient this ^java.lang.String project-id ^java.lang.String region]
    (-> this (.listJobs project-id region)))
  (^com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse [^JobControllerClient this ^com.google.cloud.dataproc.v1.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn submit-job-callable
  "Submits a job to a cluster.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     Job job = Job.newBuilder().build();
     SubmitJobRequest request = SubmitJobRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setJob(job)
       .build();
     ApiFuture<Job> future = jobControllerClient.submitJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.SubmitJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.submitJobCallable))))

(defn close
  ""
  ([^JobControllerClient this]
    (-> this (.close))))

(defn get-job-callable
  "Gets the resource representation for a job in a project.

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     GetJobRequest request = GetJobRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setJobId(jobId)
       .build();
     ApiFuture<Job> future = jobControllerClient.getJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.GetJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.getJobCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^JobControllerClient this]
    (-> this (.isTerminated))))

(defn cancel-job-callable
  "Starts a job cancellation request. To access the job resource after cancellation, call
   [regions/{region}/jobs.list](/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or
   [regions/{region}/jobs.get](/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).

   Sample code:



   try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
     String projectId = \"\";
     String region = \"\";
     String jobId = \"\";
     CancelJobRequest request = CancelJobRequest.newBuilder()
       .setProjectId(projectId)
       .setRegion(region)
       .setJobId(jobId)
       .build();
     ApiFuture<Job> future = jobControllerClient.cancelJobCallable().futureCall(request);
     // Do something
     Job response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.CancelJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerClient this]
    (-> this (.cancelJobCallable))))

(defn shutdown-now
  ""
  ([^JobControllerClient this]
    (-> this (.shutdownNow))))

