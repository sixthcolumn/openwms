class ContactpersonEmail < ActiveRecord::Base
  belongs_to :contactperson
  belongs_to :email
end
