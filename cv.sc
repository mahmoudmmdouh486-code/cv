/// <summary>
/// 4 days company, 1 day university. Available IMMEDIATELY.
/// </summary>
public class INFORMATION
{
    public string NAME = "Mahmoud Mmdouh Abdelfattah Mohamed";
    public string TITLE = "Software Engineer";
    public string EMAIL = "mahmoud1mmdouh@icloud.com";
    public string PHONE = "+20 1141691507";
    public string[] ADDRESS = { "Shubra El-Kheima", "Egypt" };
    public bool DRIVING_LICENSE = true;
    public int AGE = 21;
}

public enum PLATFORMS
{
    Windows,
    Linux
}

public enum LANGUAGES
{
    C,
    Cpp,
    Java,
    HTML,
    CSS,
    Python,
    PHP
}

public enum TOOLS
{
    MySQL,
    VisualStudioCode,
    XAMPP,
    PostgreSQL,
    Word,
    Excel,
    PowerPoint,
    Canva
}

public enum SPOKEN_LANGUAGES
{
    Arabic_Native,
    English_Good
}

public partial class EDUCATION
{
    private void BenhaUniversity()
    {
        var Faculty = "Faculty of Computers and Artificial Intelligence";
        var Degree = "Bachelor’s Degree in Scientific Computing";
        var Duration = "2021 - 2026";
        var Grade = "Good";
    }
}

public static class EXPERIENCE
{
    public static void EgyptAirTrainingAcademy()
    {
        var Role = "Trainee";
        var Location = "Cairo Airport, Egypt";
        var Description = "Part of EgyptAir Holding Company, a modern training facility providing training to personnel locally and internationally.";
    }
}

public static class CERTIFICATIONS
{
    public static void BigDataAnalysis()
    {
        var Institution = "ITIDA & National Telecommunication Institute (NTI)";
        var Duration = "Aug 11 - Sep 5, 2024 (120 hours)";
        var Topics = new string[]
        {
            "Big Data Analysis",
            "Freelancing & Service Offering",
            "Pricing Structure & Project Management",
            "Portfolio & Personal Branding",
            "Proposal Writing"
        };
    }

    public static void FlutterDevelopment()
    {
        var Institution = "ITCRC – Faculty of Computers & AI, Benha University";
        var Duration = "Aug 15 - Aug 29, 2024";
        var Training = "Mobile Development Using Flutter (Level 1)";
    }
}

public static class PROJECTS
{
    public static void CafeteriaFlask()
    {
        var Tech = "Flask, PostgreSQL";
        var Description = "A cafeteria management system with user management, product display, order system, and admin dashboard.";
        var Link = "https://github.com/mahmoudmmdouh486-code/cafeteria-flask";
    }

    public static void ZawagaRestaurant()
    {
        var Tech = "HTML, CSS";
        var Description = "A restaurant website featuring menu, about, and contact pages.";
        var Link = "https://github.com/mahmoudmmdouh486-code/Zawaga-Restaurant";
    }

    public static void TravelBlog()
    {
        var Tech = "HTML, CSS, PHP, JavaScript";
        var Description = "An educational travel blog with destinations, cost table, tips, and newsletter subscription.";
        var Link = "https://github.com/mahmoudmmdouh486-code/travel-blog-project";
    }
}

public static class LINKS
{
    public static string LinkedIn = "https://linkedin.com/in/mahmoud-mmdouh-a78657371";
    public static string GitHub = "https://github.com/mahmoudmmdouh486-code";
    public static string Portfolio = "https://vercel.com/mahmoudmmdouh486-code";
}
