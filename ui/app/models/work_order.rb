class WorkOrder < ActiveRecord::Base

  self.table_name = "work_order"

  belongs_to :contactperson, class_name: "Contactperson", foreign_key: "request_contact_id"
  belongs_to :primary_object_ref
  belongs_to :location_contact

  belongs_to :maintorder
  has_many :work_order_names
  belongs_to  :work_address, foreign_key: "address_id"

  has_and_belongs_to_many  :organizations, join_table: "work_order_organizations"
  has_and_belongs_to_many  :comments, join_table: "work_order_comments"
  has_and_belongs_to_many  :time_schedules, join_table: "work_order_schedules"
  has_and_belongs_to_many  :attachments, join_table: "work_order_attachments"

  has_and_belongs_to_many  :work_tasks, join_table: "work_order_work_tasks"
  has_and_belongs_to_many  :hazards, join_table: "work_order_hazards"


  # Handle DateTime-vs- String Auto formatting
  def created_at_formatted
    case created_at
    when DateTime
        created_at.strftime('%+')
    else
        DateTime.parse(created_at.to_s).strftime('%+')
    end
  end
  
  # alias
  def created_on
    created_at
  end

  def mock?
    created_by =~ /mock/i
  end

  def thumbnail_png
    # is this a mock?
    if created_by =~ /mock/i && internal_floor then
      "../videos/" + internal_floor
    else
      # regular production
      if attachments.size> 0 && attachments.last then
        attachments.last.poster_filename
      else 
        # "../videos/TRIMMED-Utility-truck-crews-keep-working.png"
        "../videos/No-Image.png"
      end
    end
  end

   def get_attachment
      if attachments.size > 0 and attachments.last
         attachments.last
      end
   end

   def get_name
      if work_order_name then
         work_order_name
      elsif work_order_names.first then
         work_order_names.first.name
      else
         "No-Name"
      end
   end

   def get_type
      if kind == "maintenance" then
          "Work Order"
      elsif kind == "service" then
          "Service Order"
      else
          "Work Order"
      end
   end


end
