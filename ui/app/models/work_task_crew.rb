class WorkTaskCrew < ActiveRecord::Base
  belongs_to :work_task
  belongs_to :crew
end
